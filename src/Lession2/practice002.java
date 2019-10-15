package Lession2;

import java.util.Scanner;

public class practice002 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a^2+(b%c-d)*e
		Scanner scan = new Scanner(System.in); 

		int a = scan.nextInt(); 
		int b = scan.nextInt(); 
		int c = scan.nextInt(); 
		int d = scan.nextInt(); 
		int e = scan.nextInt();
	
		int answer = calculate(a,b,c,d,e); 
		System.out.println(answer); 
	} 

	public static int calculate(int a, int b, int c, int d, int e) {
		int p = multiple(a,a);
		int m = mod(b, c);
		int n = sub(m, d);
		int o = multiple(n, e);
		int result = add(p, o);
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

