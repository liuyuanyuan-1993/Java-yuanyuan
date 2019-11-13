package Lession2;

public class SolveMeFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a;
 int b;
  
 Scanner scan = new Scanner(System.in);
 a = scan.nextInt();
 b = scan.nextInt();
 	 	
 int c = solveMeFirst(a,b);
 System.out.println(c);

	}


	public static int solveMeFirst(int m,int n){
	int c = m+n;
	return c;
	
}
