package jdbc20210314;


public class Student {
	private int stuNo;
	private String stuName;
	private String stuPhone;
	private String stuBirthday;
	private double stuHeight;
	private int classId;
	private String createTime;
	private String updateTime;
	private int del_flag;
	private StuClass stuClass;
	
	public StuClass getStuClass() {
		return stuClass;
	}
	public void setStuClass(StuClass stuClass) {
		this.stuClass = stuClass;
	}
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuPhone() {
		return stuPhone;
	}
	public void setStuPhone(String stuPhone) {
		this.stuPhone = stuPhone;
	}
	public String getStuBirthday() {
		return stuBirthday;
	}
	public void setStuBirthday(String stuBirthday) {
		this.stuBirthday = stuBirthday;
	}
	public double getStuHeight() {
		return stuHeight;
	}
	public void setStuHeight(double stuHeight) {
		this.stuHeight = stuHeight;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public int getDel_flag() {
		return del_flag;
	}
	public void setDel_flag(int del_flag) {
		this.del_flag = del_flag;
	}
	
	@Override
	public String toString() {
		return "Student [stuNo=" + stuNo + ", stuName=" + stuName + ", stuPhone=" + stuPhone + ", stuBirthday="
				+ stuBirthday + ", stuHeight=" + stuHeight + ", classId=" + classId + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + ", del_flag=" + del_flag + ", stuClass=" + stuClass + "]";
	}
	public Student(int stuNo, String stuName, String stuPhone, String stuBirthday, double stuHeight, int classId,
			String createTime, String updateTime, int del_flag) {
		super();
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuPhone = stuPhone;
		this.stuBirthday = stuBirthday;
		this.stuHeight = stuHeight;
		this.classId = classId;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.del_flag = del_flag;
	}
	public Student() {
		super();
	}
	
}
