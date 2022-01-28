package ss.it.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

import javax.sql.DataSource;

import ss.it.bo.StudentBo;

public class StudentDaoMysqlImpl implements IStudentDao {
	// properties
	private final static String query = "insert into student_data(name,total,average,result) values(?,?,?,?)";

	// Has-A relation
	private DataSource ds;

	public StudentDaoMysqlImpl(DataSource ds) {
		System.out.println("StudentDaoImpl()-1");
		this.ds = ds;
	}

	@Override
	public int insertRecord(StudentBo bo) throws Exception {
		int count = 0;
		try (Connection con = ds.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
			Random r = new Random();
	//		ps.setInt(1, r.nextInt());
			ps.setString(1, bo.getName());
			ps.setInt(2, bo.getTotal());
			ps.setFloat(3, bo.getAverage());
			ps.setString(4, bo.getResult());

			count = ps.executeUpdate();

		} catch (SQLException se) {
			se.printStackTrace();
			throw se;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return count;
	}

	private void setFloat(int i, Float average) {
		// TODO Auto-generated method stub

	}

}
