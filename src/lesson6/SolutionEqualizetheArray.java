package lesson6;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SolutionEqualizetheArray {
	    // Complete the equalizeArray function below.
	    static int equalizeArray(int[] arr) {
	
	    	int[]  x = new int[101];
	    	//先遍历arr数组然后叠加到x数组中
	    	//变量的声明，定义不能写进for循环里
	     	int m=0; 
	    	for(int i=0; i<arr.length; i++) {
	    		/* x[arr[i]-1]++;
					if(update_max < x[arr[i]-1]) 
						update_max = x[arr[i]-1];
				 */
	    	m=Math.max(++x[arr[i]],m);
	    }
	    	//arr的长度减掉x数组里出现次数最多的值
	    	return arr.length-m;
	    	
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] arr = new int[n];

	        String[] arrItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int arrItem = Integer.parseInt(arrItems[i]);
	            arr[i] = arrItem;
	        }

	        int result = equalizeArray(arr);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedWriter.close();
    
	        scanner.close();
	    }
	}

