package fighting;

public class MethodEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		evenNumber();
		//参数是什么类型，就需要给参数赋对应类型的数值
		int number =13;
		evenNumber2(number);
	}
	//无参数的方法
	public static void evenNumber() {
		int a=10;
		if(a%2 ==0) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
	
	//有参数的方法
	public static void evenNumber2(int number) {	
		if(number%2 ==0) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	
      }
	}
