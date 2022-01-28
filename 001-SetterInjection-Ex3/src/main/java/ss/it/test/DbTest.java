package ss.it.test;

import java.sql.DriverManager;

public class DbTest {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			Class.forName("oracle.jdbc.OracleDriver");
/*			java.sql.Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:suri",
					"system", "manager");
	
			java.sql.Connection conn = DriverManager.getConnection("jdbc:oracle:thin://@localhost:1521:suri",
		"system", "manager");

			java.sql.Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:suri",
		"system", "manager");
*/			java.sql.Connection conn = DriverManager.getConnection("jdbc:oracle:thin:system//@localhost:49152:suri$users",
		"system", "manager");
/*			java.sql.Connection conn = DriverManager.getConnection("jdbc:oracle:thin:system//@localhost:1521:suri",
					"system", "manager");
	*/		System.out.println("connection success");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("connection failed " + e);
		}
		System.out.println("end");
	}
}
