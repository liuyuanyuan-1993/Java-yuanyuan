package Lession2;

import java.util.Scanner;
public class practice001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //print:a+b*c
		
		Scanner scan=new Scanner(System.in);
		int a = scan.nextInt(); 
		int b = scan.nextInt(); 
		int c = scan.nextInt(); 
		int answer = calculate(a, b, c);
			System.out.println(answer);
		}

		public static int calculate(int a,int b,int c) {
			int m=multiple(b,c);
			int result =add(a,m);
			return result;
		
	}
   public static int multiple(int a,int b) {
	return a*b;
  }
   public static int add(int a,int b) {
	return a+b;
  }
}
