package Lesson00000training.copy;

public class Demo01method02 {

	public static void main(String[] args) {

/*定义格式:
 * public static void 方法名称(){
 * 方法体
 * }
调用格式：
方法名称()；
 */
		/*注意事项：
		 * 1.方法调用的先后顺序无所谓
		 * 2.方法定义必须是挨着的，不能在一个方法里边套用另一个方法
		 * 3.方法定义之后，自己不会执行，如果希望执行，一定要进行方法的调用
		 */
		printMethod();	
		}
	public static void printMethod() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=20;j++) {
			System.out.print("*");	
			}
			System.out.println();	
		}
		
	}

}
