package Lession2;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*�ӷ� add(int a, int b)
		  * ���� sub(int a, int b)
		  * �˷� multiple(int a, int b)
		  *���� divide(int a, int b)
		  * ȡ�� mod(int a, int b)
		  * 
		  * ��һ����calculateȡֵa��b��c;
		  * �ڶ�����calculate���ú���multiple�õ�a/b;
		  * ������������add�����õ�a/b+c��
		  * ���Ĳ����ѽ��������main������
		  * ���岽����ӡ�������
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