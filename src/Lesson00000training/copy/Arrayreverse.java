package Lesson00000training.copy;

public class Arrayreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 int[] Array = {10,20,30,40,50};
 
 //两个索引，min和max互换位置，直到min>=max时停止换位置，最后min递增，max递减
 for(int min =0, max = Array.length-1;min<max;min++,max--) {
	 
	 //第三个元素作为中间商倒手
	   int temp =Array[min];
	   Array[min]= Array[max];
	   Array[max]=temp;
	 }
 //再次遍历数组，打印其中元素，得到反转后的结果
     for(int i=0;i<Array.length;i++) {
	   System.out.println(Array[i]);
 }
 
 }
}
