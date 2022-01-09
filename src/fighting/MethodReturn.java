package fighting;

public class MethodReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//数据类型 变量名=方法名(参数);
		boolean a = isevenNumber(19);
		System.out.println(a);
		}
	public static boolean isevenNumber(int number) {
		if(number%2==0) {
			return true;
		}else {
			return false;
		}
	}

}
