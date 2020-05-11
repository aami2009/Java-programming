package concurrentPackage;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.*;

public class BlockingQueueExample {

	public static void main(String[] args) {
		BlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(5);
		Producer producer = new Producer(arrayBlockingQueue);
		Consumer consumer = new Consumer(arrayBlockingQueue);
		System.out.println("Starting Producer."+System.getProperties());
		new Thread(producer).start();
		System.out.println("Starting Consumer.");
		new Thread(consumer).start();

	}

}
class Producer implements Runnable {
	protected BlockingQueue blockingQueue;
	public Producer(BlockingQueue blockingQueue){
		this.blockingQueue = blockingQueue;
	}
	public void run(){
		try{
            String[] array = {"Tamal","Anirban","Tanay"};
			for(int i = 0; i<array.length; i++){
				PojoClass pojoClass = new PojoClass();
				pojoClass.setName(array[i]);
				blockingQueue.put(pojoClass);
				Thread.sleep(3000);
				System.out.println("Count"+i);
			}
			
		}catch(InterruptedException ex){
			
		}finally{
			
		}
	}
}
class Consumer implements Runnable{
	protected BlockingQueue blockingQueue;
	public Consumer(BlockingQueue blockingQueue){
		this.blockingQueue = blockingQueue;
	}
	public void run(){
		try{
			while(blockingQueue !=null ){
				PojoClass pojoClass1 = (PojoClass)blockingQueue.take(); 
				System.out.println(pojoClass1.getName());
			}
		}catch(Exception ex){
			
		}
	}
}
class PojoClass{
	private String name = "";
	private String state = "";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
