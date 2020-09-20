
public class SumHundred {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int sum =0;
    for(int i =1;i<=100;i++) {
    	sum=sum+i;	
    }
    //打印不能写到循环里边，否则也会打印100次
    System.out.println(sum);
	}

}
