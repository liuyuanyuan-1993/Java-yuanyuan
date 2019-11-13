package Lession2;

public class lianxi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 
		 * a + b * c
		 * 
		 * 第一步: 主函数向calculate 传值a,b,c 
		 * 第二部：calculate调用函数multiple，并得到b*c的值
		 * 第三部：calculate调用函数add负责a+b*c 
		 * 第四部：calculate将结果返回给main函数 
		 * 第五步: main函数将结果打印
		 * 
		 * 备注运算符: + - * / %
		 * 
		 */
		int a;
		int b;
		int c;
		int d;
		calculate(a,b, c);

		multiple();
		add();
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();
	}

	public static void mutiple(int b, int c);

	{
		int d = b * c;
		System.out.println(d);
	}

	public static void add(int a, int b);

	{
		int c = a + b;
		System.out.println(c);
	}

}
