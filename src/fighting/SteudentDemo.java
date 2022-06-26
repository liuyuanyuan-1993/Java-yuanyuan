package fighting;

//学生类的测试类
public class SteudentDemo {

	public static void main(String[] args) {
  Student s =new Student();
  //輸出 翟子路，0默認值
  //s.setAge(-27);
  
  //輸出 翟子路，27
  s.setAge(27);
  s.name = "翟子路";
  
  s.show();
  
	}

}
