package Lesson00000training.copy;
/*有参数：小括号当中有内容，当一个方法需要一些数据条件，
 *                 才能完成任务的时候，就是有参数。
* 
 * 无参数：小括号当中留空，一个方法不需要任何数据条件，
 *                自己就能独立完成任务，就是无参数。
 *                例如：定义一个方法，打印固定10次HelloWorld
*/
public class Method03peremeter {

	public static void main(String[] args) {
		
	method1(10,20);	
	method2();	
	}
	//两个数字相乘，必须知道两个数字分别是多少，否则无法进行计算
 public static void method1(int a,int b) {
	int result =a*b;
	System.out.println ("结果是："+result);
 }
 
	//打印固定10次HelloWorld
	public static void method2() {
		for(int i=1;i<=10;i++) {
			System.out.println("Hello,World!"+i);
		}
	}
 }

