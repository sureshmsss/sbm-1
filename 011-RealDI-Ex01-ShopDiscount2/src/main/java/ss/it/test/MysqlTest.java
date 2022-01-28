package ss.it.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("helo");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sbm", "root", "root");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from shop_bill_discount");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			con.close();
			System.out.println("thank");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
