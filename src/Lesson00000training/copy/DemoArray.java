package Lesson00000training.copy;
//注意事项：1静态初始化没有直接指定长度，但是仍然会自动推算出长度
//2静态初始化标准格式可以拆分成两个步骤
//3动态初始化也可以拆分成两个步骤
//4静态初始化一旦使用省略格式，就不能拆分成两个步骤了。

public class DemoArray {

	public static void main(String[] args) {

	//静态初始化
  int[] arrayB = new int [] {5,10,15};
  
   //省略静态初始化
  int[] arrayC= {5,10,15};
  
    //标准静态初始化拆分
  int[] arrayD ;
  arrayC= new int [] {5,10,15};
  
	//动态初始化
  int[] arrayE= new int [10];
  
   //动态初始化拆分
  int[] arrayF;
  arrayF= new int [10];
  
  int[] arrayA=new int[] {10,20,30};
  //[I@15db9742 
  //直接打印数组名称，得到的是数组对应的内存地址哈希值。
 // 二级制：0，1
//十六进制：0123456789abcdef
  System.out.println (arrayA);
	}

}	
