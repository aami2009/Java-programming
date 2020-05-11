package concurrentPackage;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {

	public static void main(String[] args)throws Exception {
		CyclicBarrier cyclicBarrier = new CyclicBarrier(4);// TODO Auto-generated method stub
		Thread t1 = new Thread(new MyRunnable("T1",3000,cyclicBarrier));
		Thread t2 = new Thread(new MyRunnable("T2",2000,cyclicBarrier));
		Thread t3 = new Thread(new MyRunnable("T3",1000,cyclicBarrier));
		t1.start();
		t2.start();
		t3.start();
		cyclicBarrier.await();
		System.out.println(": finished");

	}

}
class MyRunnable implements Runnable{
	private String name;
	private int sleep;
	private CyclicBarrier cyclicBarrier;
	public MyRunnable(String name,int sleep,CyclicBarrier barrier){
		this.name = name;
		this.sleep = sleep;
		this.cyclicBarrier = barrier;
	}
	
	public void run(){
		try{
			System.out.println(name + ": started");
			Thread.sleep(sleep);
			System.out.println(name + ": 1st time waiting");
			//cyclicBarrier.await();
			System.out.println(name + ": 2nd time sleeping " + sleep);
	        Thread.sleep(sleep);
	     // all threads need to wait for each other to get to this point
	        System.out.println("Number of waiting threads" + cyclicBarrier.getNumberWaiting());
	        System.out.println(name + ": 2nd time waiting");
	        //cyclicBarrier.await();
	        
	        //System.out.println(name + ": finished");

			
		}catch(Exception ex){
			
		}
	}
}
