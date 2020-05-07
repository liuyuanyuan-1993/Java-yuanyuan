package Lesson00000training.copy;

//遍历数组
public class AraryOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] array= {10,20,30,40,50,60};
      System.out.println (array[0]);
      System.out.println (array[1]);
      System.out.println (array[2]);
      System.out.println (array[3]);
      System.out.println (array[4]);
      System.out.println ("==========");
      
      
      //使用循环，次数实际就是数组的长度，i就是数组的索引编号
      for(int i=0;i<5;i++) {
    	  System.out.println (array[i]);    	  
      }
      
      System.out.println ("=========="); 
      
      //int len=array.length;
      //for(int i=0;i<len;i++) 数组的长度
      for(int i=0;i<array.length;i++) {
    	  System.out.println (array[i]);   
      }   
	  System.out.println ("==========");
	}

}
