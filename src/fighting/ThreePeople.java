package fighting;

import java.util.Scanner;

public class ThreePeople {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int height1 = sc.nextInt();
			int height2 = sc.nextInt();
			int height3 = sc.nextInt();
			
			int tempheight = height1 > height2 ? height1 : height2;
			int maxheight = tempheight > height3 ? tempheight : height3;
		    System.out.println(maxheight);
		}
}
