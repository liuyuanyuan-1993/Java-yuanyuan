public class Demo04IfElseExt {
 public static void main(String[]args) {
	//x和y的关系满足如下：
	 //如果x>3,那么y=2x+1；
	 //如果-1<x<3,那么y=2x；
	 //如果x<=-1,那么y=2x-1；
	 
	 //必须先给x赋一个值
	 int x=19;
	 int y;
	 if (x>3){
		 //不能直接写成2x
		 y=2*x+1;
	 }
	 //此处不能连着写，一定要分开写且用“&&”连接
	 else if(-1<x && x<3) {
		 y=2*x; 
	 }
	 else{
		 y=2*x-1; 
	 }
	 System.out.println("结果是："+y);
 }
 
}
