package sunday02;

public class TestString {
	public static void main(String[] args) {
		   //在内存堆里
		    String str1 = new String("123");
		    String str2 = new String("123");
		    System.out.println(str1==str2);//false
		    
		    
		    //String是不可变的，在常量池里
		    String str3 ="123";
		    String str4 ="123";
		    System.out.println(str1==str3);//false
		    System.out.println(str3==str4);//true
		    
		    
		    
		    //StringBuffer是可以修改，在堆中。同一对象做修改，而不是新开辟位置
		    StringBuffer s = new StringBuffer("123");
		    
		    String str5 ="123";
		    str5 ="1234";
		    //在常量池中是新开辟了一块区域
		    
		    System.out.println(str5);
		   
	}
   

	}

