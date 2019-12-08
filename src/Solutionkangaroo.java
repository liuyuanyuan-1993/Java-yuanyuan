import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solutionkangaroo {

    // Complete the kangaroo function below.
    static int kangaroo(int x1, int v1, int x2, int v2) {
    	//10000>=x2>x1>=0; && 10000>=v1>v2>=0;
		/*
		 * int m= x2-x1; int n= v1-v2;
		 */
         
    	 //if(m % n == 0)
    	   // if(v1-v2>0 && x2-x1>0 && (x2-x1)%(v1-v2)==0)
 
		
     
	 if((x2-x1)>0 && (v1-v2)>0 && (x2-x1) % (v1-v2) == 0){ 
		 System.out.println("YES");	 
		 } 
	 else {
		 System.out.println("NO");
	 }}
   
    	
    	 
    	 
    	/** x1£¬v1£¬x2£¬v2
          0     3      4     2
    	 * if(int3 == int4) {
 			System.out.println("int3 equals to int4");
 		}
 		else if(int3 > int4) {
 			System.out.println("int3 is bigger than int4");
 		}
 		else {
 			System.out.println("int3 is smaller than int4");
 		}
    	 */
    	 
    	


private static final Scanner scanner = new Scanner(System.in);

public static void main(String[] args) throws IOException {
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    String[] x1V1X2V2 = scanner.nextLine().split(" ");

    int x1 = Integer.parseInt(x1V1X2V2[0]);

    int v1 = Integer.parseInt(x1V1X2V2[1]);

    int x2 = Integer.parseInt(x1V1X2V2[2]);

    int v2 = Integer.parseInt(x1V1X2V2[3]);

    String result = kangaroo(x1, v1, x2, v2);

    bufferedWriter.write(result);
    bufferedWriter.newLine();

    bufferedWriter.close();

    scanner.close();
}
}