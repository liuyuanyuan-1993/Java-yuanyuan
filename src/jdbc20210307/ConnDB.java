package jdbc20210307;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnDB {
 public static Connection getConnection() {
	 Connection conn =null;
	//1.加载驱动类
		 try {
			Class.forName("oracle.jdbc.OracleDriver");
			//2.获取连接通道
			//@IP：端口号：数据库名字
			//127.0.0.1 本机ip localhost本地主机
			 String url ="jdbc:oracle:thin:@127.0.0.1:1521:orcl";
			 
			 //invalid username/password; logon denied
			 String user ="scott";
			 String password= "Feiyoung123";
			 conn=DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//类找不到异常 可能原因 1.没有导包或者导错包 2.类名错误
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	 return conn;
 }
     public static void main(String [] args) {
    	 //测试是否连接
    	 System.out.println(ConnDB.getConnection());
     }
}
