package multithreading;

import java.util.ArrayList;

public class MyThread{
   public static void main(String args[]) throws Exception{
	  ArrayList<Runnable> threads = new ArrayList<Runnable>();
	  Thread1 thread1 = new Thread1();
	  Thread2 thread2 = new Thread2();
	  
	  threads.add(thread1) ;
	  threads.add(thread2) ;
	  
      Thread[] systemThreads = new Thread[threads.size()];
	  
	  for (int cnt = 0; cnt < systemThreads.length; cnt++) {
     	 systemThreads[cnt] = new Thread(threads.get(cnt));
     	 systemThreads[cnt].start();
      }
      try {
          for (Thread element : systemThreads) {
              element.join();
              //System.out.println("I am Thread 1"+element.isAlive());
          }
      } catch (Exception e) {
          
         
      }
      System.out.println("Main thread now load final data into Mongo Database");//Main thread now compute on both the data sets and store into MongoDb.
      
   }
}
class Thread1 extends Thread{
	public void run(){
		System.out.println("Thread1 fetching data from Oracle database");
		try{
		Thread.sleep(3000);
		}catch(Exception ex){
			
		}
	}
}
class Thread2 extends Thread{
	public void run(){
		System.out.println("Thread2 fetching data from file from some file system");
		try{
			Thread.sleep(3000);
			}catch(Exception ex){
				
			}
	}
}
