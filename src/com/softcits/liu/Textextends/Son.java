package com.softcits.liu.Textextends;

public class Son extends Father {
   public double weight =60;
   
   //方法的重写  方法的返回值类型，double父亲类型大于等于孩子可以，小于孩子类型不行double
   //如果子类有重写方法，java会优先找子类自己的方法
   //方法重写 条件：继承下 子类重写父类方法 返回值 方法名参数列表一致
   //方法的重载 条件：在同一个类里，方法名一致，参数列表不一致（个数，类型，顺序）
   //继承是一个父类，单继承，接口是有多实现
   
   //final 写的类不能被继承 
	public void earnMoney() { System.out.println("孩子赚钱"); 
	}
	 
}
