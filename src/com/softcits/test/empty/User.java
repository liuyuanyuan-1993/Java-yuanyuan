package com.softcits.test.empty;

public class User {
	private String id;
	private String name;
	private String password;
	private int age;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public User(String id, String name, String password, int age) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
	}

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", age=" + age + "]";
	}
               //类 User  影子/对象 u
	public boolean login(User u) {
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
