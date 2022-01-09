package fighting;

public class Hour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//循环嵌套
		for(int hour =0;hour<24;hour++) {
			
			for(int min =0;min<60;min++) {
				System.out.println(hour+"时"+min+"分");
			}
		}
	}

}
