package fighting;

import java.util.Scanner;

public class Week {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int week = sc.nextInt();
		//switch（表达式）
			switch(week) {
			case 1:
				System.out.println("星期一");
				break;
			case 2:
			System.out.println("星期二");
			break;
			case 3:
				System.out.println("星期三");
				break;
			case 4:
				System.out.println("星期四");
				break;
			case 5:
			System.out.println("星期五");
				break;
			case 6:
			System.out.println("星期六");
				break;
			case 7:
			System.out.println("星期日");
				break;
		//表示所有情况都不匹配时，相当于else
			default:
				System.out.println("你输入的星期数有误");
				break;
			}
			
	}

}
