package com.Sunday1011;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class lesson1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int i =1;
 Integer m =2;
 m.byteValue();
 
 String str = "123";
 //字符串拼接
 System.out.println(str+1);
 
 //Integer的方法 把字符串转成int类型
 int num = Integer.parseInt(str);
 System.out.println(num+1);
 
 
 Integer a=1;
 Integer b=1;
 Integer c=128;
 Integer d=128;
 Integer e=-127;
 Integer f=-127;
 System.out.println(a==b);//true
 //Integer 在常量池中的取值范围是-128~127
 System.out.println(c==d);//false
 System.out.println(e==f);//true
 
 Date n=new Date();
 System.out.println(n);
 
 //月 MM
 //定义标准
 String pattern1 = "yyyy-MM-dd-hh-mm-ss";
 String pattern2 = "yyyy-MM-dd hh:mm:ss";
 //标准化
 SimpleDateFormat sdf = new SimpleDateFormat(pattern1);
 
 //把标准对实例化出来的日期n生效
 String timeStr = sdf.format(n);
 System.out.println(timeStr);
 
// Random random =new Random();
// System.out.println(random.nextInt(9));//【0，9)
 

 System.out.println(Math.random());//随机数
 System.out.println(Math.min(1, 2));//比较两个数大小
 System.out.println(Math.abs(-1));//取绝对值
	}

}
