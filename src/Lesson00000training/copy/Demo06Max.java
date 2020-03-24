package Lesson00000training.copy;

public class Demo06Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a=19;
  int b=27;
  //三元运算符：语法为：“条件表达式？表达式1：表达式2；”
  //int max=a>b?a:b;
  //System.out.print(max);
  
  //--------------------------------
  
  //使用标准的if else形式
  int max;
  if(a>b) {
	 max=a; 
  }else {
	  max=b;
  }
  System.out.println("最大值"+max);
	}

}
