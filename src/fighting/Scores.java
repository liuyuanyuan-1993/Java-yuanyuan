package fighting;

import java.util.Scanner;

public class Scores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc =new Scanner(System.in);
			int score = sc.nextInt();
			
	 //数据测试：正确数据，边界数据，错误数据都测到，才算是健壮的程序
			
			if(score>100 ||score<0) {
				System.out.println("你输入的数据有误");
			}else if(score>=95&&score <=100) {
				System.out.println("买个自行车");
			}else if(score>=90&&score <95) {
				System.out.println("去游乐场玩");
			}else if(score>=80&&score <90) {
				System.out.println("买个玩具");
			}else {
				System.out.println("胖揍一顿");
			}
	}

}
