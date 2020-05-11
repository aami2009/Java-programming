package concurrentPackage;

import java.util.concurrent.Semaphore;


public class SemaphoreExample {

	public static void main(String[] args) {
		  Semaphore semaphore = new Semaphore(3);/*In hospital there are two doctor available(two permits), but no of patients are 4, so, at a time two patient 
		                                        can check and other two patient will be wait*/ 
		  //Semaphore semaphore=new Semaphore(2);
	      MyThread mt1 = new MyThread(semaphore);
	      MyThread mt2 = new MyThread(semaphore);
	      MyThread mt3 = new MyThread(semaphore);
	      MyThread mt4 = new MyThread(semaphore);
	      mt1.start();
	      mt2.start();
	      mt3.start();
	      mt4.start();

	}

}
class MyThread extends Thread{
	Semaphore semaphore;
	 
	   MyThread(Semaphore semaphore){
	      this.semaphore = semaphore;
	   }
	 
	   public void run() {
		   System.out.println("Run"); 
	      try {
	         semaphore.acquire();
	         System.out.println("Hello " + this.getName());
	         try {
	            sleep(6000);
	         } catch (Exception e) {}
	      } catch (InterruptedException ie) {
	      } finally {
	         semaphore.release();
	         System.out.println("Goodbye " + this.getName());
	      }
	   }
}
