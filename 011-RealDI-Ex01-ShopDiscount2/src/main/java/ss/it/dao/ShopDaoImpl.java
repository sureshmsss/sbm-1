package ss.it.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import ss.it.bo.ShopBo;

public class ShopDaoImpl implements IShopDao {

	// HAS-A relation
	private DataSource ds;
	private final static String sql = "insert into shop_bill_discount values(SBM_ID_SEQ.NEXTVAL,?,?,?)";

	public ShopDaoImpl(DataSource ds) {
		System.out.println("ShopDaoImpl()-ds-param");
		this.ds = ds;
	}

	public ShopDaoImpl() {
	}

	@Override
	public int insertBill(ShopBo bo) throws Exception {

		int result = 0;
		try (Connection conn = ds.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, bo.getName());
			ps.setDouble(2, bo.getBill());
			ps.setDouble(3, bo.getDiscount());

			result = ps.executeUpdate();
			if (ps != null) {
				System.out.println(ps.getResultSet());
				System.out.println("sql values :" + bo.getName() + "-" + bo.getBill() + "-" + bo.getDiscount());
				System.out.println("record instered");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
