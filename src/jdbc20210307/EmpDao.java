package jdbc20210307;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpDao {
  //插入
  public int insert(Emp emp) {
	  Connection conn = ConnDB.getConnection();
	  //主语sql之间的空格 无效sql语句
	 // String sql="delete from emps where empno="+empno;
	  //载体
	  PreparedStatement pst=null;
	  String sql ="insert into emps(empno,ename,job,sal,hiredate,deptno)values"+
	  "(?,?,?,?,to_date(?,'yyyy-MM-dd'),?)";
	  try {
		pst=conn.prepareStatement(sql);
		pst.setInt(1,emp.getEmpno());
		pst.setString(2,emp.getEname());
		pst.setString(3,emp.getJob());
		pst.setDouble(4,emp.getSal());
		pst.setString(5,emp.getHiredate());
		pst.setInt(6,emp.getDeptno());
		
		  return pst.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
			if(pst!=null) {
				pst.close();
			}
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
	  EmpDao empDao =new EmpDao();
	  int empno=7369;
	// System.out.println(empDao.insert(empno));
	  Emp emp =new Emp();
	  emp.setEmpno(empno);
	  emp.setDeptno(10);
	  emp.setEname("TEST");
	  emp.setJob("SALESMAN");
	  emp.setSal(888.88);
	  emp.setHiredate("2021-3-7");
	  System.out.println(empDao.insert(emp));
  }
}
