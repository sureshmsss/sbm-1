package ss.it.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;

import ss.it.bo.ShopBo;

@Repository("mysqlDao")
@PropertySource("ss/it/commons/info.properties")
public class ShopDaoMysqlImpl implements IShopDao {
	// HAS-A relation
	@Autowired
	private DataSource ds;
	private final static String sql = "insert into shop_bill_discount(name,bill,discount) values(?,?,?)";

	@Override
	public int insertBill(ShopBo bo) throws Exception {

		int result = 0;
		try (Connection conn = ds.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, bo.getName());
			ps.setDouble(2, bo.getBill());
			ps.setDouble(3, bo.getDiscount());

			result = ps.executeUpdate();
			if (ps != null) {
				// System.out.println(ps.getResultSet());
				System.out.println("sql values :" + bo.getName() + "-" + bo.getBill() + "-" + bo.getDiscount());
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
