package fighting;

//学生类
public class Student {

		String name;
		// int age;
		private int age;
		
		
		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			//this.age = age;
			if(age<0||age>120) {
				System.out.println("輸入的年齡有誤");
			}else {
				this.age = age;
			}
			
		}


		public void show() {
			System.out.println(name+","+age);
		}
	}


