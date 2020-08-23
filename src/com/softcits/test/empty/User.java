package com.softcits.test.empty;

public class User {
	public String id;
	public String name;
	public String password;
	public int age;

	public boolean login(String name,String password) {
		//.equals  是string的一个方法，返回值类型是布尔类型。比较前后两个值是否一样
        if("admin".equals(name)&&"123".equals(password)) {
        return true;	
        }else {
        	return false;
        }

    }
	
	 public static void main(String[] args) {
	 System.out.println("123".equals("123")); }
	 
	
}
