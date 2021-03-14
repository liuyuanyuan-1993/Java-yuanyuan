package jdbc20210314;

public class StuClass {
	private int classId;
	private String className;
	private String classLoc;
	private String classMemo;
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getClassLoc() {
		return classLoc;
	}
	public void setClassLoc(String classLoc) {
		this.classLoc = classLoc;
	}
	public String getClassMemo() {
		return classMemo;
	}
	public void setClassMemo(String classMemo) {
		this.classMemo = classMemo;
	}
	public StuClass() {
		super();
	}
	@Override
	public String toString() {
		return "StuClass [classId=" + classId + ", className=" + className + ", classLoc=" + classLoc + ", classMemo="
				+ classMemo + "]";
	}
	
}