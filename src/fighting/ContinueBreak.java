package fighting;

public class ContinueBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =1;i<=5;i++) {
			if(i%2==0) {
				//跳过某次执行，继续进行下一次执行
				//continue;
				
				//结束当前整个循环
				break;
			}
			System.out.println(i);
		}
		
	}

}
