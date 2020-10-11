package com.Sunday1011;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Listjihe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List list =new ArrayList();
list.add(1);
list.add(new Date());

list.add("true");
list.add(null);
System.out.println(list.size());
System.out.println(list.remove(1));
System.out.println(list.contains("true"));
System.out.println(list.contains(1));//不是下标，而是判断是否包含数值1，不需要引上
System.out.println(list.indexOf(2));
list.isEmpty();//判断是否为空，不是
//list.clear();

	}

}
