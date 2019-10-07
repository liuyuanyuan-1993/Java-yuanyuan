package Lession2;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*加法 add(int a, int b)
		  * 减法 sub(int a, int b)
		  * 乘法 multiple(int a, int b)
		  *除法 divide(int a, int b)
		  * 取余 mod(int a, int b)
		  * 
		  * 第一步：calculate取值a，b，c;
		  * 第二步：calculate调用函数multiple得到a/b;
		  * 第三步：调用add函数得到a/b+c；
		  * 第四步：把结果返还给main函数；
		  * 第五步：打印出结果；
		  */
        // print out :a/b+c
	Scanner scan = new Scanner(System.in);
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			
			int answer = calculate(a,b,c);
			System.out.println(answer);	
		}
		public static int calculate(int a, int b, int c) {
			int m = multiple(a,b);
			int result = add(m,c);
			return result;
		}
		public static int multiple(int a, int b) {
			return a/b;
		}
		public static int add(int a, int b) {
			return a+b;
		}
	}