package fighting;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//初始化语句，条件判断语句，条件控制语句
		for(int i=1;i<=5;i++) {
			//循环体语句
			System.out.println("Hello World");
		}
		    System.out.println("=================");
		    
		//初始化语句
		int j=1;
		//条件判断语句
		while(j<=5) {
			//循环体语句
			System.out.println("Hello World");
			//条件控制语句
			j++;
			
		}
		 System.out.println("=================");
		//初始化语句
		int z =1;
		do {
			//循环体语句
			System.out.println("Hello World");
			//条件控制语句
			z++;
			//条件判断语句
		}while(z<=5);
		
		//死循环
		for(;;) {
			System.out.println(" Hello");
		}
		
//		while(true) {
//			System.out.println(" World");
//		}
		
   }
	
	
	}

