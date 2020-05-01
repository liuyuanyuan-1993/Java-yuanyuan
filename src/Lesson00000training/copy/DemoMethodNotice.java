package Lesson00000training.copy;
/*使用方法的注意事项：
 * 1.方法应该定义在类当中，但是不能在方法中再定义方法，不能嵌套
 * 2.方法定义的前后顺序无所谓
 * 3.方法定义之后不会执行，想要执行一定要调用，单独调用，打印调用，赋值调用
 * 4.如果方法有返回值，那么必须写上“return 返回值；”
 * 5.return后面的返回值数据，必须和方法的返回值类型对应起来
 * 6.对于void没有返回值的方法，不能写return后面的返回值，只能写return自己
 * 7.对于void方法当中最后一行的return可以省略不写
 * 8.一个方法当中可以有多个return语句，但是必须保证只有一个被执行，两个return不能连写。
 */


public class DemoMethodNotice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getMax(3,5));
	}
public static int getMax(int a,int b) {
	if(a>b) {
		return a;
	}else {
		return b;
	}	
}
}
