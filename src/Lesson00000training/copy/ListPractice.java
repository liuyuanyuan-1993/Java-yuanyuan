package Lesson00000training.copy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListPractice {
   public static void main(String[] args) {
	List<String> list =new ArrayList<>();
	
	//list.add(e:"a");不明白为啥黑马就可以这样写 我就不可以
	list.add("a");
	list.add("b");
	list.add("c");
	list.add("d");
	list.add("a");
	//有序，有索引，元素可以重复
	//打印时不是地址值说明重写了toString方法
	System.out.println(list);
	
	
	//public void add(int index,E element);在指定位置添加元素
	//在索引值为3的位置添加元素，即c和d之间
	list.add(3, "小媛加油");
	System.out.println(list);
	
	//public E remove(int index)移除列表中指定元素，返回的是被移除的元素
	//移除指定元素
	String removeE = list.remove(2);
	System.out.println("被移除的元素："+removeE);//被移除的元素c
	System.out.println(list);//[a, b, 小媛加油, d, a]
	
//public E set(int index,E element)用指定元素替换集合中指定位置元素，返回的是更新前的元素
    String setE = list.set(4, "A");
    System.out.println("被替换的元素"+setE);
    System.out.println(list);
    
    //list遍历的3种方式
    //①使用普通for循环
    for (int i = 0; i < list.size(); i++) {
		String s =list.get(i);
		System.out.println(s);
	}
    System.out.println("==================");
    //②使用迭代器
    Iterator<String> it = list.iterator();
    while(it.hasNext()) {
    	String s =it.next();
    	System.out.println(s);
    }
    System.out.println("==================");
  //③使用增强for循环
    for(String s:list) {
    	System.out.println(s);
    }
    
		/*注意操作索引时，一定要防止索引越界异常
		 *  IndexOutofBoundsException索引越界异常，集合会报
		 *  ArrayIndexOutofBoundsException数组索引越界异常
		 *  StringIndexOutofBoundsException字符串索引越界异常
		 */
   }
}
