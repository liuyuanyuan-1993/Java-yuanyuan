package jdbc20210314;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



// 持久层  处理数据
public class StudentDao {
	// 删除
	public  int delete(int stuNo) {
		Connection conn = ConnDb.getConnection();
		PreparedStatement pst = null;
		// 逻辑删除
		String sql ="update student set del_flag = 1,updatetime=to_char(systimestamp,'yyyyMMddHH24missSSS') where stuno =?";
		try {
			pst = conn.prepareStatement(sql);
			// 并非所有变量都已绑定    占位符和赋值不对应
			pst.setInt(1, stuNo);
			return pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			ConnDb.closeDb(null, pst, conn);
		}
		return 0;
	}
	// 查询一览
	public List<Student> selectAll(){
		List<Student>  list = new ArrayList<>();
		Connection conn = ConnDb.getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;
		String sql="select \r\n" + 
				"s.stuno,\r\n" + 
				"s.stuname,\r\n" + 
				"s.stuphone,\r\n" + 
				"s.stubirthday,\r\n" + 
				"s.stuheight,\r\n" + 
				"s.classid,\r\n" + 
				"s.createtime,\r\n" + 
				"s.updatetime,\r\n" + 
				"s.del_flag,\r\n" + 
				"sc.classname,\r\n" + 
				"sc.classloc,\r\n" + 
				"sc.classmemo\r\n" + 
				"from student s\r\n" + 
				"left outer join \r\n" + 
				"stuclass sc\r\n" + 
				"on s.classid = sc.classid"
				+ " where s.del_flag=0";// 逻辑上过滤未删除的数据
		try {
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while(rs.next()) {
				Student s = new Student();
				// 从结果集中收集属性
				s.setStuNo(rs.getInt("stuno"));
				s.setStuName(rs.getString("stuname"));
				s.setStuBirthday(rs.getString("stubirthday"));
				s.setStuPhone(rs.getString("stuphone"));
				s.setStuHeight(rs.getDouble("stuheight"));
				s.setCreateTime(rs.getString("createtime"));
				s.setUpdateTime(rs.getString("updatetime"));
				s.setClassId(rs.getInt("classid"));
				s.setDel_flag(rs.getInt("del_flag"));
				StuClass c = new StuClass();
				c.setClassId(rs.getInt("classid"));
				c.setClassName(rs.getString("classname"));
				c.setClassLoc(rs.getString("classloc"));
				c.setClassMemo(rs.getString("classmemo"));
				// 把班级放到学生信息中
				s.setStuClass(c);
				// 添加到集合
				list.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			ConnDb.closeDb(rs, pst, conn);
		}
		return list;
	}
	
	
	public static void main(String[] args) {
		StudentDao dao = new StudentDao();
//		System.out.println(dao.delete(8));
		List<Student> list = dao.selectAll();
		for(Student s:list) {
			System.out.println(s);
		}
	}
}
