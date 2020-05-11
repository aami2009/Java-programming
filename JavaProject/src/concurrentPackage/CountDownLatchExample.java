package concurrentPackage;

import java.util.concurrent.CountDownLatch;


public class CountDownLatchExample {

	public static void main(String[] args) {
		
		final CountDownLatch latch = new CountDownLatch(2);
		
		Thread t1 = new Thread(new MyThread1("T1", latch));
		Thread t2 = new Thread(new MyThread2("T2", latch));
		t1.start();
		t2.start();
		
		try{
			latch.await();//Main thread will wait untill the CountDownLatch 0, when it is 0 then main thread will start for execution.
			
		}catch(InterruptedException  ex){
			
		}
		 System.out.println("Main thread now load final data into Mongo Database");
		

	}

}
class MyThread1 extends Thread{
	private String name;
	private final CountDownLatch latch;
	public MyThread1(String name,CountDownLatch latch ){
		this.name = name;
		this.latch = latch;
	}
	public void run(){
		System.out.println(name +"Thread1 fetching data from Oracle database");
		try{
			Thread.sleep(5000);
		}catch(Exception ex){
			
		}
		System.out.println( name + " ready");
		
		latch.countDown();
	}
}
class MyThread2 extends Thread{
	private String name;
	private final CountDownLatch latch;
	public MyThread2(String name,CountDownLatch latch ){
		this.name = name;
		this.latch = latch;
	}
	public void run(){
		System.out.println(name +"Thread2 fetching data from file from some file system");
		try{
			Thread.sleep(5000);
		}catch(Exception ex){
			
		}
		System.out.println( name + " ready");
		
		latch.countDown();
	}
}
