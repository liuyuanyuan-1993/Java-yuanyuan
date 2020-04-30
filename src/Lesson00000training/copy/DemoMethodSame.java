package Lesson00000training.copy;

public class DemoMethodSame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//三要素：
		/* 1.返回值类型
		 * 2方法名称 
		 * 3.参数列表
		 */
	System.out.println(	IsSame(3,5));//false
	System.out.println(	IsSame(5,5));//true
	}
public static boolean IsSame(int a,int b) {
	boolean s;
	if(a==b) {
		s=true;
	}else {
		s=false;
	}
	//给same赋值 a等于b么？若等于就是true，不等就是false
	//boolean same = a==b?true:false;
	
	return a==b;
}
}
