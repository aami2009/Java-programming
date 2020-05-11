package multithreading;

public class InterThreadCommunication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Queue queue = new Queue();
		
        new Consumer(queue);
        new Producer(queue);
	}

}
class Queue{
	int count;
	boolean valueSet = false;
	
	synchronized int get(){
		//System.out.println("valueSet get()"+valueSet);
		if(!valueSet){
			//System.out.println("valueSet get()===="+valueSet);	
		  try{
			 wait(); 
		  }catch(InterruptedException ex){
			  
		  }
		}  
		  System.out.println("Get---"+count);
		  valueSet = false;
		  notify();
		
		return count;
	}
	synchronized void put(int count){
		//System.out.println("valueSet put()"+valueSet);
		if(valueSet){
			//System.out.println("valueSet put()==="+valueSet);
			try{
				wait();
			}catch(InterruptedException ex){}
		}	
			this.count = count;
			System.out.println("Put---"+count);
			valueSet = true;
			notify();
		
	}
}
class Producer implements Runnable{
	Queue queue;
	Producer(Queue queue){
		this.queue = queue;
		new Thread(this,"Producer").start();
		
	}
	public void run() {
		int count = 0;
		
		for(int j = 10; j <=15; j++){
			queue.put(count ++);
		}
	}
}
class Consumer implements Runnable{
	Queue queue;
	Consumer(Queue queue){
		this.queue = queue;
		new Thread(this,"Consumer").start();
	}
	public void run() {
		for(int j = 10; j <=15; j++){
			queue.get();	
		}
	}
	
}
