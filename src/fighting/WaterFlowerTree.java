package fighting;

public class WaterFlowerTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//水仙花数：一个三位数，它的个位十位百位的立方数的和，等于这个数本身
		//打印所有的水仙花数
		int count =0;
		for(int i =100;i<=999;i++) {
			//取到个位上的数
			int ge = i%10;
			//取到十位上的数
			int shi = i/10%10;
			//取到百位上的数
			int bai = i/10/10%10;
			
			//如果个位的立方+十位的立方+百位的立方和等于这个数，它就是水仙花数
			if(ge*ge*ge+shi*shi*shi+bai*bai*bai==i) {
				//打印出所有的水仙花数
				//System.out.println(i);
				count++;	
			}	
		}
		//一共有多少个水仙花数
		System.out.println(count);
	}

}
