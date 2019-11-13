package Lession3;

import java.util.Scanner;

public class practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 3. 计算一个整数的次幂 例如： 输入 2 3 输出 8 解释 2*2*2=8
		 */
		 Scanner scan = new Scanner(System.in);

		    int s = scan.nextInt(); 
		/*
		 * for(int m;m >0;m++) { System.out.println(m*int 1); } for(int n;n >=0;n++) {
		 * System.out.println(int 1);}
		 */
		  
		  for(long result =1L;result>1;result++) {
			  result = result * s;  
		  }
			
	   System.out. println result;
		
		    
		    
		   
		    
	}

}
