package Lesson00000training.copy;

public class Demo02methodDefine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 方法的三种调用方式：
		 * 1.单独调用：方法名称（）；或 方法名称（参数）； 参数可加可不加
		 * 2.打印调用：System.out.println(方法名称（参数）)；
		 * 3.赋值调用: 数据类型 变量名称=方法名称（参数）；
		 * 
 *此前学习的方法，返回值类型固定写为void，这种方法只能单独调用，不能打印和赋值调用。
		 */
		//单独调用
		sum(10,20);
		System.out.println("=============");
		
	    //打印调用
		System.out.println(sum(10,20));
		System.out.println("=============");
		
		//赋值调用
		int number =sum(10,80);
		number+=35;
		System.out.println("变量的值:"+number);
		
	}
	
   public static int sum(int a,int b) {
	System.out.println("方法执行辣");
	int result =a+b;
	return result;
	
   }
}
