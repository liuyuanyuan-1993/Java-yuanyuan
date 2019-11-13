package Lession2;

import java.util.Scanner;

public class like01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a+b^2-c
		
		Scanner scan = new Scanner(System.in); 
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		int answer = calculate(a, b, c);
		System.out.println(answer);

	}

	public static int calculate(int a, int b, int c) {
		int m = multiple(b);
		int n = sub(m, c);
		int t= add(a, n);
        return t;

	public static int multiple(int b) {
		return b * b;
	}

	public static int sub(int b, int c) {
		return b - c;
	}

	public static int add(int a, int b) {
		 return a + b;
		 
	 }
}
