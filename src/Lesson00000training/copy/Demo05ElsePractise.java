package Lesson00000training.copy;

public class Demo05ElsePractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int score =90;
 if( score>=90 && score<=100) {
	 System.out.println("优秀");
 }
 else if(score>=80 && score<=89) {
	 System.out.println("好");
 }
 else if(score>=70 && score<=79) {
	 System.out.println("良");
	}
 else if(score>=60 && score<=69) {
	 System.out.println("及格");
 }
 //要考虑超出100的情况
 else if(score>=0&&score<60){
	 System.out.println("不及格");
 }
 else {
	 System.out.println("数据不合理"); 
 }
	}
}
