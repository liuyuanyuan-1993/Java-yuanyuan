package jdbc20210307;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StuDao {
	//删除
	public int delete (int stuno) {
		Connection conn = ConnDB.getConnection();
		String sql="delete from STUDENT where stuno="+stuno;
		Statement st = null;
		
		try {
			//3.创建载体
			st = conn.createStatement();
			
			//4.执行方法 返回影响行数
			return st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//5.关闭资源
	
		finally {
			//先关载体
			try {
				if(st!=null) {
					st.close();
				}
				// 后关通道
				if(conn!=null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 0;
		
	}
	
	public static void main(String[] args) {
		  //测试方法
		  StuDao stuDao =new StuDao();
		  int stuno=5;
		 System.out.println(stuDao.delete(stuno));
		  
		 // empno=7369;
		 
//		  Emp emp =new Emp();
//		  emp.setEmpno(empno);
//		  emp.setDeptno(10);
//		  emp.setEname("TEST");
//		  emp.setJob("DEV");
//		  emp.setSal(888.88);
//		  emp.setHiredate("2021-3-7");
		//System.out.println(empDao.insert(emp));
		//  System.out.println(empDao.selectByEmpno(7521));
	  }
}