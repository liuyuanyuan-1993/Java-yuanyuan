package Lession3;
import java.util.Scanner;
public class practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*����һ����������ӡ��Ӧ��ͼ��
		���磺 ���� 5   �������
		     *
		    **
		   ***
		  ****
		 *****
 */
		 Scanner scan = new Scanner(System.in);
		 
	   /*    int i = scan.nextInt();
	       int j = scan.nextInt();*/
	       int x = scan.nextInt();
	      for(int j=1;j<=x;j++) {
	         for(int i=1;i<=x-j;i++) {
	        	 System.out.print(" ");
	         }
	         for(int m=1;m<=j;m++) { 
	        	 System.out.print("*");	 
	         }
	         System.out.println();	 
	         }
	}}
	
	/*     //for(int i =1;  i<=10;i++) {}
	     //  for(int i=0;i<t;i++)
	     
	       // for(int j=N-i;j>0;j--) {
	       // System.out.println(" "+"*"); 
	       ////}
	     
	    for(int j=1;j<=i;j++) {
	    	 System.out.println("*");
	    }
	     
	 	//for(int i =1;  i<=10;i++) {
    		//System.out.println( N+" "+ "x" + " " + i +" " +"="+" "+N*i);	
	}
}*/
