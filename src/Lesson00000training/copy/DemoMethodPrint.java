package Lesson00000training.copy;
//题目要求：定义一个方法，用来打印指定次数的Hello，World
/*三要素：
 * 返回值：只是一大堆的打印操作而已，没有计算，也没有结果要告诉调用处
 * 方法名称：printCount
 * 参数列表：到底要打印多少次必须告诉我，否则无法打印，次数，int
 */

public class DemoMethodPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printCount(10);
	}
	public static void printCount(int num) {
		//并不知道想要打印多少次，所以让i<=num,即输入的那个值。
		//所以不需要变动i的次数，只需变更调用的函数值即可
		for(int i=1;i<=num;i++) {
			System.out.println("Hello,World!"+i);
		}
	}
}
