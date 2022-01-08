package fighting;

import java.util.Scanner;

public class OddEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int a =sc.nextInt();
		
			if(a%2==0) {
				System.out.println(a+"是偶数");
			}else{
				System.out.println(a+"是奇数");
			}
	}

}
