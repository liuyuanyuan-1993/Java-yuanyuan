package Lession3;

import java.util.Scanner;

public class practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2. ����һ����������ӡ ��1���������ܺ� ���磺 ���� 3 ��� 6 ���� 1+2+3=6
		 * 
		 * �Ȳ����У�(n+1)*n/2
		 */
		 Scanner scan = new Scanner(System.in);
		 int x= scan.nextInt();
		 
		int result =0;
		for(int i=1;i<=x;i++)
		{//result=i+result;
		result += i;
		
		}
		System.out.println(result);	
}
	}
