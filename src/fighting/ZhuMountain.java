package fighting;

public class ZhuMountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义一个计数器
		int count = 0;
		//定义纸张的厚度为0.1毫米
		double paper = 0.1;
		//定义珠峰的高度为8843.43米，8844430毫米
		int zf =8844430;
		//只要纸张的厚度不大于珠峰就一直循环
		while(paper<=zf) {
			//折一次厚度变成2倍
			paper *=2;
			//次数加1
			count++;
		}
		System.out.println(count);
	}

}
