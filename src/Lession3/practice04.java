package Lession3;

import java.util.Scanner;

public class practice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 4. �ж�һ�������Ƿ�Ϊ�������������yes���������no ���磺 ���� 79 ��� yes ���� 79Ϊ���������ܱ�1������������κ�������
		 */
		 Scanner scan = new Scanner(System.in);
	
		    int n = scan.nextInt(); 
		    
		for(int i=2;i<n;i++) 
			if(n % i==0) {
				System.out.println ("no");
		}
		else {
			System.out.println ("yes");
			}
		
		 
	}

}
