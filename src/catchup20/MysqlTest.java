package catchup20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MysqlTest {
	public static void main(String[] args) throws ClassNotFoundException {
		// load mysql driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		try (
				//setup database connection
				Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.1.109:3306/sales", "root", "123456");
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("select * from product_tbl");) {
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDouble(3) + " " + rs.getDate(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
