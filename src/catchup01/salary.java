package catchup01;

import java.util.Scanner;

public class salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("请输入税前工资");
		int salary=scan.nextInt();
		
		//int a=salary*0.08+salary*0.02+salary*0.1;
		//小数想变成整数需要强制类型转换(float → int类型)；
		int a=(int)(salary*0.2);
		int b=139;
		int later =salary-a+b;
		System.out.println(later);
	}

}
