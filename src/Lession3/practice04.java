package Lession3;

import java.util.Scanner;

public class practice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 4. 判断一个整数是否为质数，是则输出yes，否则输出no 例如： 输入 79 输出 yes 解释 79为质数，不能被1和自身以外的任何数整除
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
