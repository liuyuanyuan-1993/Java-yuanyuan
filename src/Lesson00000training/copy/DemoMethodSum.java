package Lesson00000training.copy;

//题目要求：定义一个方法，求出1-100之间的和

/*三要素：
 * 返回值：有返回值，计算结果是一个int数字
 * 方法名称：sum1
 * 参数列表：数据范围已经确定，是固定的，所以不需要告诉我任何条件，不需要参数 
 */
public class DemoMethodSum {

	public static void main(String []args) {
		sum1();
		int a=sum1();
		System.out.println(a);
		//System.out.println(sum1());
	}	
		public static int sum1() {
			int sum=0;
			for(int i=1;i<=100;i++) {	
				sum+=i;
		}
		return sum;
	}
}
