package Lesson00000training.copy;

import java.util.ArrayList;

public class Manager extends User{
  public Manager() {
	 //super(); 默认赠送 不用手写 
  }
  public Manager(String name,int money) {
	  super(name,money);
  }
  /**
 * @param totalMoney
 * @param count
 * @return
 */
public ArrayList<Integer> send(int totalMoney,int count){
	//首先需要一个集合，用来存储若干个红包的金额
	  ArrayList<Integer>  redList = new ArrayList<>();
	  
	//  leftMoney群主当前有的钱 totalMoney群主要发的钱
	  int leftMoney =super.getMoney();
	  if(totalMoney>leftMoney) {
		  System.out.println("余额不足");
		  //返回空集合
		  return redList;  
  }
	  
//	    扣钱，其实就是重新设置余额  super.setMoney是父类的setmoney方法
	  super.setMoney(leftMoney-totalMoney);

//	  发红包需要平均拆分成count份
	  int avg = totalMoney/count;
	  //余数就是剩的零钱
	  int mod = totalMoney%count;
	  
//	  除不开的零钱包在最后一个红包中
	  for(int i=0;i<count-1;i++) {
		  redList.add(avg);
	  }
	  
	  //最后一个红包
	  int last =avg+mod;
	  redList.add(last);
	  
	  return redList;
  }
}
