package Lesson00000training.copy;

//题目要求：定义一个方法，用来【求出】两个数字之和。（你帮我算，算完之后把结果告诉我）
//题目要求：定义一个方法，用来【打印】两个数字之和。（你帮我算，算完之后自己打印结果，不用告诉我）

//※Notice：
//1.对于有返回值的方法，可以使用单独调用，打印调用或者赋值调用
//2.但对于无返回值的方法，只可以使用单独调用，不能打印调用或者赋值调用
public class Demo04MethodReturn {

	public static void main(String[] args) {
		//赋值调用 正确写法
		int num=getsum(2,7);
		System.out.println("返回值是："+num);
		System.out.println("===============");	
		
		//单独调用 虽然是正确写法，但没有用到返回值
		getsum(8,3);

		System.out.println("===============");	
		//打印调用 正确写法
		System.out.println(getsum(2,3));
		System.out.println("===============");	
		
		//对于void没有返回值的方法，只能单独不能赋值和打印调用
		// System.out.println(printsum(2,3));  //错误写法
		
		printsum(5,7);
		
	}
//我有返回值int，谁调用我，我就把结果告诉给谁	
   public static int getsum(int a, int b) {
	int result=a+b;
	return result;
   }
   
 //我没有返回值int，不会把结果告诉任何人，而是我自己打印输出   
   public static void printsum(int a, int b) {
		int result=a+b;
		System.out.println(result);	

}
   }
