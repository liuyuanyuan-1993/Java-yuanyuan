	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	public class SolutionAppleandOrange {

	    // Complete the countApplesAndOranges function below.
	    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
	  //先令beat等于0
	     	int beat=0; 
	     	
	    	for(int i=0; i<apples.length; i++) {
	    		if(a+apples[i]>=s && a+apples[i]<=t)
	    			beat++;
	    	}
	    	//打印苹果击中几次
	    		System.out.println (beat);
	   //重新让beat等于0
	    	 beat=0; 
	    	 for(int i=0; i<oranges.length; i++)
	    		if(b+oranges[i]>=s && b+oranges[i]<=t) {
	    			beat++;	
	    	}
	    	//打印橘子击中几次
	    		System.out.println (beat);
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        String[] st = scanner.nextLine().split(" ");

	        int s = Integer.parseInt(st[0]);

	        int t = Integer.parseInt(st[1]);

	        String[] ab = scanner.nextLine().split(" ");

	        int a = Integer.parseInt(ab[0]);

	        int b = Integer.parseInt(ab[1]);

	        String[] mn = scanner.nextLine().split(" ");

	        int m = Integer.parseInt(mn[0]);

	        int n = Integer.parseInt(mn[1]);

	        int[] apples = new int[m];

	        String[] applesItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < m; i++) {
	            int applesItem = Integer.parseInt(applesItems[i]);
	            apples[i] = applesItem;
	        }

	        int[] oranges = new int[n];

	        String[] orangesItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int orangesItem = Integer.parseInt(orangesItems[i]);
	            oranges[i] = orangesItem;
	        }

	        countApplesAndOranges(s, t, a, b, apples, oranges);

	        scanner.close();
	    }
	}

