package fighting;

public class MethodMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//在main方法中调用定义好的方法并使用变量保存
		int result =getMax(10,20);
		System.out.println(result);
		//在main方法中调用定义好的方法并直接打印结果
		//System.out.println(getMax(10,30));
	}
	public static int getMax(int a,int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
}
