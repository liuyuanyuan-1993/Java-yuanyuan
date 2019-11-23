package lesson5.oop.model;

	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	public class SockMerchant {

	    // Complete the sockMerchant function below.
	    static int sockMerchant(int n, int[] ar) {
       //一共有100只袜子，从arr[1]开始
        int[] color_arr=new int[101];
        
	    for(int i=0;i<ar.length;i++)
	    color_arr[ar[i]]++;
	    
	  //int index=ar[i];
		   //color_arr[index]++;}与上文写法一致
	    
	    int sum=0;
	   
	    for(int i=0;i<color_arr.length;i++)
	    	sum=sum +color_arr[i]/2;
	    return sum;
	    }
	    	
	
	    

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	      

	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] ar = new int[n];

	        String[] arItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int arItem = Integer.parseInt(arItems[i]);
	            ar[i] = arItem;
	        }

	        int result = sockMerchant(n, ar);
System.out.println(result);
	        scanner.close();
	    }
	}

