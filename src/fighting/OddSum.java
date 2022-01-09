package fighting;

public class OddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//打印1-100之间的偶数和
		int sum = 0;
		for(int i=2;i<=100;i++) {
			if(i%2==0) {
			sum +=i;
			}
		}
		System.out.println("1-100之间的偶数和是"+sum);
	}

}
