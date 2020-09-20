import java.util.Scanner;

public class BMI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  System.out.println("请输入性别，0表示女性，1表示男性：");
  int sex =sc.nextInt();
  System.out.println("请输入身高，精确到小数点后两位，单位（米）：");
  double length = sc.nextDouble();
  System.out.println("请输入体重，单位（公斤）：");
  double weight = sc.nextDouble();
  //bmi指数 =体重（kg）/身高^2(米)
  double bmi = weight/length/length;
  System.out.println("您的体重指数是："+bmi);
  System.out.println("您的健康程度是：");
  if(sex ==0) {
	  if(bmi<19) {
		  System.out.println("女士，您的体重过轻，请加强膳食的补充");
	  }
  else if(bmi<24) 
  { 
	  System.out.println("恭喜您，女士，您的体重适中，请保持！");
	  }
  else if(bmi<29) 
  { 
	  System.out.println("女士，您的体重已经过重，请注意锻炼身体！");
	  }
  else if(bmi<34) 
  { 
	  System.out.println("女士，您已经属于肥胖行列，请注意饮食习惯，加强锻炼！");
	  }
  else System.out.println("女士，您已经非常肥胖，必须下定决心减肥了！");
	} 
	
  else {
		 if (bmi<20 ) { 
			 System.out.println("男士，您的体重过轻，请加强膳食的补充"); 
			 } 
		 else if(bmi<25) { 
			 System.out.println("恭喜您，男士，您的体重适中，请保持！");
			 } 
		 else if(bmi<30) {
	         System.out.println("男士，您的体重已经过重，请注意锻炼身体！"); 
	        }   
		 else if(bmi<35) {
	         System.out.println("男士，您已经属于肥胖行列，请注意饮食习惯，加强锻炼！");
	         } 
		 else System.out.println("男士，您已经非常肥胖，必须下定决心减肥了！"); 
		 }
	 System.out.println("专家建议，最理想的体重指数是22，为了健康的身体，大家一起加油吧！"); 
	 }
}