package lesson5.oop.model;

import lesson5.oop.action.AbstractAction2;


		public class Animal111 implements AbstractAction2{
			
			private String name;
			private Integer age;
			private String gender;
			private String color;
			//具体什么动物
			
			private String category;
			public String getName() {
				return name;
			}
			public String getCategory() {
				return category;
			}
			public void setCategory(String category) {
				this.category = category;
			}
			public void setName(String name) {
				this.name = name;
			}
			public Integer getAge() {
				return age;
			}
			public void setAge(Integer age) {
				this.age = age;
			}
			public String getGender() {
				return gender;
			}
			public void setGender(String gender) {
				this.gender = gender;
			}
			public String getColor() {
				return color;
			}
			public void setColor(String color) {
				this.color = color;
			}
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		
		
		}