package catchup01;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Wired {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    
if(N%2==1) {
	System.out.println("Weird");
}
else if(5>=N&N>=2) {
	System.out.println("Not Weird");
}
else if(20>=N&N>=6) {
	System.out.println("Weird");
}
else if(0>=N||N>100) {
	System.out.println("Out of bounds");
}
else
{
	System.out.println("Not Weird");
}        
        
        scanner.close();
        
      
        
        
    }
}
