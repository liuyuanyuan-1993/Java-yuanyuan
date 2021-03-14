package jdbc20210314;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnDb {
	/*
	 * 1.加载驱动类  class.forname
	 * 2.获取连接通道 Connection
	 * 3.创建载体 PreparedStatement Statement
	 * 4.执行语句 Query Update
	 * 5.关闭资源 close
	 * 
	 * */
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url ="jdbc:oracle:thin:@127.0.0.1:1521:orcl";
			String user = "scott";
			String password = "tiger";
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	// 关闭资源
		// Statment st 实际传递的PreparedStatement类型对象    多态参数   Object
		public static void closeDb(ResultSet rs,Statement st,Connection conn) {
			try {
				if(rs!=null) {
					rs.close();
				}
				if(st!=null) {
					st.close();
				}
				if(conn!=null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	public static void main(String[] args) {
		System.out.println(ConnDb.getConnection());
	}
}
