package com.softcits.test.view;

import java.util.Scanner;

import com.softcits.test.empty.User;

public class Testuser {
  public static void main(String[] args) {
	  System.out.println("欢迎来到xx系统");
	  System.out.println();
	  //控制台输入
	Scanner scan =new Scanner(System.in) ;
	//把输入内容赋给name
	String na =scan.next();
	System.out.println("请输入password");
	String pwd =scan.next();
	
	
	//用谁实例化谁，实例化user 
	//不在同一个包下，所以需要导包
	User u = new User();
	u.setName(na);
	u.setPassword(pwd);
	
	if(u.login(u)) {
		System.out.println("登录成功！"+"欢迎你"+na);
	}else {
		System.out.println("登录失败");
	}
	
}
}
