package fighting;

import java.util.Scanner;

public class Seasons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int seasons = sc.nextInt();
		switch(seasons) {
		case 1:
			System.out.println("这是冬季");
			break;
		case 2:
			System.out.println("这是冬季");
			break;
		case 3:
			System.out.println("这是春季");
			break;
		case 4:
			System.out.println("这是春季");
			break;
		case 5:
			System.out.println("这是春季");
			break;
		case 6:
			System.out.println("这是夏季");
			break;
		case 7:
			System.out.println("这是夏季");
			break;
		case 8:
			System.out.println("这是夏季");
			break;
		case 9:
			System.out.println("这是秋季");
			break;
		case 10:
			System.out.println("这是秋季");
			break;
		case 11:
			System.out.println("这是秋季");
			break;
		case 12:
			System.out.println("这是冬季");
			break;
		default:
			System.out.println("输入的月份有误");
			break;
		}
	}

}
