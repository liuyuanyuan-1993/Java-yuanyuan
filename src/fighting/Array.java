package fighting;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = new int[10];
//		System.out.println(arr);
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
		
		//arr =null;
		//System.out.println(arr);
		//数组为空，不指向任何数值，就会出现数组越界异常NullPointerException
		//System.out.println(arr[0]);
		int[] arr = {109,37,307,68,67,3,90};
		int max =arr[0];
		for(int i =1;i<arr.length;i++) {
			if(arr[i]>max) {
				max =arr[i];
			}
		}
		System.out.println(max);
	}

}
