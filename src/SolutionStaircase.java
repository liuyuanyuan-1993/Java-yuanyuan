import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SolutionStaircase {

    // Complete the staircase function below.
    static void staircase(int n) {
    	 Scanner scan = new Scanner(System.in);
		 

  	       //循环打印行 1~n行
  	      for(int j=1;j<=n;j++) {
  	    	  
  	    	  //处理空格
  	         for(int i=1;i<=n-j;i++) {
  	        	 System.out.print(" ");
  	         }
  	         //处理#
  	         for(int m=1;m<=j;m++) { 
  	        	 System.out.print("#");	 
  	         }
  	         System.out.println();	 
  	         }
  	}

    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
