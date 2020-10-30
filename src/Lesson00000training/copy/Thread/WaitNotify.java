package Lesson00000training.copy.Thread;

public class WaitNotify {

	public static void main(String[] args) {
		//创建锁对象，保证唯一
       Object obj = new Object();
        //创建一个顾客线程（消费者）
       new Thread() {
    	   @Override
    	   public void run() {


    		   //保证等待和被唤醒的线程只有一个执行，需要使用同步技术
    		   synchronized (obj) {
    			   System.out.println("告知老板包子数量");
    			   //调用start方法，放弃cpu的执行权，进入到waiting状态（无限等待）
    			   try {
					obj.wait();
				} catch (Exception e) {
					e.printStackTrace();
				}
    			   //唤醒之后执行的代码
    			   System.out.println("包子已经做好了，开吃！");
    		   }
    	   
		   
    	   }
       }.start();
       
       //创建一个老板线程
       new Thread() {
    	public void run() {
    		//可以加一个死循环 让他一直在做包子


    		try {
				Thread.sleep(2000);//花5秒做包子
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
    		 //保证等待和被唤醒的线程只有一个执行，需要使用同步技术
    		synchronized (obj) {
    			System.out.println("老板5分钟之后做好包子，唤醒顾客，可以吃包子了");
    			obj.notify();
    		}
    		
		
    	}
    	}.start();
    	  
		   
		
       
	}

}
