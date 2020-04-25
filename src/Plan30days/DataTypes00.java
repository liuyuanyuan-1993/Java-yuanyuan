package Plan30days;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DataTypes00 {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */

        /* Read and save an integer, double, and String to your variables.
         * */
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        int a = scan.nextInt();
        double b = scan.nextDouble();
        
        //string 类型要多打这句话，否则只能打印出第一个空格前面的内容
        scan.nextLine();
        String c =  scan.nextLine();

     
        System.out.println(i+a);
        System.out.println(d+b);
        System.out.println(s+c); 
        scan.close();
    }
}