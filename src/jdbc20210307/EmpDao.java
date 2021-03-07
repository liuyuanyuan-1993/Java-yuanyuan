package jdbc20210307;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpDao {
  //删除
  public int delete(int empno) {
	  Connection conn = ConnDB.getConnection();
	  //主语sql之间的空格 无效sql语句
	  String sql="delete from emps where empno="+empno;
	  //载体
	  Statement st=null;
	  
	  try {
		st=conn.createStatement();
		  return st.executeUpdate(sql);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
			if(st!=null) {
				st.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	  return 0;
	  
  }
  
  public static void main(String[] args) {
	  EmpDao empDao =new EmpDao();
	  int empno=7369;
	  System.out.println(empDao.delete(empno));
	  
  }
}
