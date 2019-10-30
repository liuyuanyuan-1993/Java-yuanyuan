package Lession3;

import java.util.Scanner;

public class practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2. 输入一个整数，打印 从1至该数的总和 例如： 输入 3 输出 6 解释 1+2+3=6
		 * 
		 * 等差数列；(n+1)*n/2
		 */
		 Scanner scan = new Scanner(System.in);
		    int n = scan.nextInt(); 
	
	    	 System.out.println((n+1)*n/2);
	}
	
}
