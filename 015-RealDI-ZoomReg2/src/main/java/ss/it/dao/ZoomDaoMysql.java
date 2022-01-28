package ss.it.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;

import ss.it.bo.ZoomBo;

@Repository("mysql")
@PropertySource("ss/it/commons/info.properties")
public class ZoomDaoMysql implements IZoomDao {
	// query
	private static final String query = "insert into zoom_register(name,mobno,course,mailId,fee) values(?,?,?,?,?)";
	@Autowired
	@Qualifier("dbopt")
	private DataSource datasource;

	@Override
	public int insertData(ZoomBo bo) throws Exception {
		System.out.println("ZoomDaoMysql.insertData()");
		int result = 0;
		//
		try (Connection con = datasource.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {

			ps.setString(1, bo.getName());
			ps.setString(2, bo.getMobNo());
			ps.setString(3, bo.getCourse());
			ps.setString(4, bo.getMailId());
			ps.setDouble(5, bo.getFee());

			// execute the query
			if (ps != null)
				result = ps.executeUpdate();

		} catch (SQLException se) {
			se.printStackTrace();
			throw se; // exception rethrowing
		} catch (Exception e) {
			e.printStackTrace();
			throw e; // exception rethrowing
		}

		return result;
	}

}
