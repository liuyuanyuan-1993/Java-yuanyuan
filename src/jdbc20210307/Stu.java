package jdbc20210307;

public class Stu {
	private int stuno;
	private String stuname;
	private int stuphone;
	private String stubirthday;
	private double stuheight;
	private int classid;

	
	
	public int getStuno() {
		return stuno;
	}
	public void setStuno(int stuno) {
		this.stuno = stuno;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public int getStuphone() {
		return stuphone;
	}
	public void setStuphone(int stuphone) {
		this.stuphone = stuphone;
	}
	public String getStubirthday() {
		return stubirthday;
	}
	public void setStubirthday(String stubirthday) {
		this.stubirthday = stubirthday;
	}
	public double getStuheight() {
		return stuheight;
	}
	public void setStuheight(double stuheight) {
		this.stuheight = stuheight;
	}
	public int getClassid() {
		return classid;
	}
	public void setClassid(int classid) {
		this.classid = classid;
	}
	@Override
	public String toString() {
		return "Stu [stuno=" + stuno + ", stuname=" + stuname + ", stuphone=" + stuphone + ", stubirthday="
				+ stubirthday + ", stuheight=" + stuheight + ", classid=" + classid + ", getStuno()=" + getStuno()
				+ ", getStuname()=" + getStuname() + ", getStuphone()=" + getStuphone() + ", getStubirthday()="
				+ getStubirthday() + ", getStuheight()=" + getStuheight() + ", getClassid()=" + getClassid()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
