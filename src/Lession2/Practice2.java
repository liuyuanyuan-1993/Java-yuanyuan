package Lession2;

import java.util.Scanner;

public class Practice02 {

	// TODO Auto-generated method stub

	// ����a^2+(b%c-d)*e
	/*
	 * *��һ��:��������calculate ��ֵa,b,c��d��e 
	 * �ڶ�����calculate���ú���mod�����õ�b%c��ֵ
	 * ��������calculate���ú���sub�������õ�b%c-d 
	 * ���Ĳ���calculate���ú���multiple���õ���b%c-d��*e
	 * ���岽��calculate���ú���multiple���õ�a*a�� 
	 * ������:calculate���ú���add���õ� a^2+(b%c-d)*e
	 * ���߲�:calculate��������ظ�main���� 
	 * �ڰ˲�:main�����������ӡ
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