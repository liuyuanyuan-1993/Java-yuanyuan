package Lesson00000training.copy;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class LetReview {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		//处理数字后面的回车换行
		scanner.nextLine();
		String even_String = "";
		String odd_String = "";

		while (n-- > 0) {
			String a = scanner.nextLine();

			for (int i = 0; i < a.length(); i++) {
				if (i % 2 == 0) {
					even_String += a.charAt(i);
				} else {
					odd_String += a.charAt(i);
				}
			}
			
			System.out.println(even_String + " " + odd_String);
	
			even_String = "";
			odd_String = "";
		}
		
		scanner.close();
	}
}