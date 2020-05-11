package multithreading;

import java.util.ArrayList;
import java.util.List;

public class MyRunnable {

	/**
	 * @param args
	 */
	private static Thread thread1;
	private static Thread thread2;
	private static Thread thread3;
	public static List list = new ArrayList();
	public static void main(String[] args) {
		Thread4 myRunnable1 = new Thread4();
		Thread5 myRunnable2 = new Thread5();
		Thread6 myRunnable3 = new Thread6();
		thread1 = new Thread(myRunnable1);
		thread1.setName("Ashis");
		thread2 = new Thread(myRunnable2);
		thread2.setName("Ranjan");
		thread3 = new Thread(myRunnable3);
		thread3.setName("Iqubal");
		
		thread1.start();
		thread3.start();
		//thread2.start();
		
		
	}

}
class Thread4 extends MyRunnable implements Runnable{
	public void run(){
		try{	
			 Thread.sleep(300);
			for(int j = 0; j <list.size(); j++){
				  System.out.println("I am Thread 1--------:"+list.get(j));
			}
		}catch(Exception ex){
			  ex.printStackTrace();
		}
	}

	
}
class Thread5 implements Runnable{
	public void run(){
		for(int j = 0; j<2; j++){
			  try{	
				  Thread.sleep(4000);
				  System.out.println("I am Thread 2");
			  }catch(Exception ex){
			  }
			  
		}
	}
}
class Thread6 extends MyRunnable implements Runnable{
	public void run(){
		      try{	
			    list.add("10");
				list.add("12");
				list.add("13");
				list.add("15");
				System.out.println("I am Thread 3"+ list.size());
				//Thread.sleep(16000);
			  }catch(Exception ex){
				  ex.printStackTrace();
			  }
			  
			
	}
}
