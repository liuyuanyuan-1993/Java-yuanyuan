package lesson5.oop.model;

import lesson5.oop.action.AbstractAction;

// 闈㈠悜瀵硅薄鐨勪笁澶х壒鎬�
//绗竴涓細 灏佽
public class Swimer extends Human implements AbstractAction{
	
	@Override
	public void run() {
		System.out.println( this.getName() + " is running");
	}
	
	
}
