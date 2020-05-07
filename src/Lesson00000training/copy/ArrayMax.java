package Lesson00000training.copy;

public class ArrayMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] Array = {3,5,6,9,7,2};
      //求最大值
      int Min=Array[0];
      for(int i=1;i<Array.length;i++) {
    	  if (Array[i]<Min) {
    	      Min=Array[i];
    	      }
      }
      System.out.println(Min);
	}

}
