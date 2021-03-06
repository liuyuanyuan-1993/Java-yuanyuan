package catchup20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MysqlTest {
	public static void main(String[] args) throws ClassNotFoundException {
		// load mysql driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
				//setup database connection
				Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sales", "root", "123456");
				Statement stmt = conn.createStatement();
 int num = stmt.executeUpdate("insert into product_tbl"+ "(product_name,"+ "price,"
 + "onboard_date,produce_city)values('Honor','2999.0','2020-10-01','Dalian');");
 //看是否插入进去了honor
 //System.out.println("Insert rows: " + num);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
