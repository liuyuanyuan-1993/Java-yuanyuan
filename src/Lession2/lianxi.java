package Lession2;

public class lianxi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 
		 * a + b * c
		 * 
		 * ��һ��: ��������calculate ��ֵa,b,c 
		 * �ڶ�����calculate���ú���multiple�����õ�b*c��ֵ
		 * ��������calculate���ú���add����a+b*c 
		 * ���Ĳ���calculate��������ظ�main���� 
		 * ���岽: main�����������ӡ
		 * 
		 * ��ע�����: + - * / %
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
