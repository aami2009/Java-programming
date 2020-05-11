package concurrentPackage;

import java.io.File;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;


public class MarvalLS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Runnable> listThread = new ArrayList<Runnable>();
		
		listThread.add(new StbSerializerThread());
		listThread.add(new NadSerializerThread());
		listThread.add(new OrderSerializerThread());
		listThread.add(new CircuitSerializerThread());
		Thread[] systemThreads = new Thread[listThread.size()];
		for (int cnt = 0; cnt < systemThreads.length; cnt++) {
       	 systemThreads[cnt] = new Thread(listThread.get(cnt));
       	 systemThreads[cnt].start();
        }
		try{
			for(Thread element : systemThreads){
				element.join();
			}
			System.out.println("Now main thread is running");	
		}catch(Exception ex){
			ex.printStackTrace();
		}
		//return null;
        
    }

}
class StbSerializerThread implements Runnable{

	public void run() {
		System.out.println("StbSerializerThread");
		
	}
	
}
class NadSerializerThread implements Runnable{

	public void run() {
		System.out.println("NadSerializerThread");
		
	}
	
}
class OrderSerializerThread implements Runnable{

	public void run() {
		System.out.println("OrderSerializerThread");
		
	}
	
}
class CircuitSerializerThread implements Runnable{

	public void run() {
		System.out.println("CircuitSerializerThread");
		
	}
	
}