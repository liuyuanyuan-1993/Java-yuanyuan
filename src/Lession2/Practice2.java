package Lession2;

import java.util.Scanner;

public class Practice02 {

	// TODO Auto-generated method stub

	// 计算a^2+(b%c-d)*e
	/*
	 * *第一步:主函数向calculate 传值a,b,c，d，e 
	 * 第二步：calculate调用函数mod，并得到b%c的值
	 * 第三步：calculate调用函数sub函数，得到b%c-d 
	 * 第四步：calculate调用函数multiple，得到（b%c-d）*e
	 * 第五步：calculate调用函数multiple，得到a*a， 
	 * 第六步:calculate调用函数add，得到 a^2+(b%c-d)*e
	 * 第七步:calculate将结果返回给main函数 
	 * 第八步:main函数将结果打印
	 */
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int e = scan.nextInt();

		int answer = calculate(a,b,c,d,e);
		System.out.println(answer);
	}
    
	// print out:a^2+(b%c-d)*e
	public static int calculate(int a,int b,int c,int d,int e);{
	 int p =multiple(a*a);
	 int m =mod(b,c);
	 int n =sub(m-d);
	 int o =multiple(n*e); 
	 int result =add(p+o);
	 return result;
	 
	}
	public static int mod(int a, int b) {
		return a % b;
	}

	public static int sub(int a, int b) {
		return a - b;
	}

	public static int multiple(int a, int b) {
		return a * b;
	}

	public static int multiple(int a) {
		return a * a;
	}

	public static int add(int a, int b) {
		return a + b;
	}

}