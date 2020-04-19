package catchup01;

public class whilenumber7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //9223372036854775807
		long i=1L;
		//while 和 for是循环，if是判断
		 while(i<9223372036854775807L)
		  { if(i%7==0)
			 System.out.println(i);
			 i++;
		} 
	}

}
