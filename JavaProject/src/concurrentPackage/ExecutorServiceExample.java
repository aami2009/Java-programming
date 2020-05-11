package concurrentPackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(2);
		List<Runnable> workList = new ArrayList<Runnable>();
		workList.add(new Task1());
		workList.add(new Task2());
		workList.add(new Task3());
		
		for(int i = 0; i<workList.size(); i++){
		  service.execute(workList.get(i));
		}
		service.shutdown();

	}

}
class Task1 implements Runnable{
	public void run(){
		try{
			System.out.println("Task1");
			//System.out.println(this.getName() + " started: " + new Date() );
			Thread.sleep(1000);
			//System.out.println(this.getName() + " finished:" + new Date() );		
		}catch(Exception ex){
			
		}
	}
	
}
class Task2 implements Runnable{
	public void run(){
		try{
			System.out.println("Task2");
			//System.out.println(this.getName() + " started: " + new Date() );
			Thread.sleep(1000);
			//System.out.println(this.getName() + " finished:" + new Date() );		
		}catch(Exception ex){
			
		}
	}	
}
class Task3  implements Runnable{
	public void run(){
		try{
			System.out.println("Task3");
			//System.out.println(Thread.getName() + " started: " + new Date() );
			Thread.sleep(1000);
			//System.out.println(this.getName() + " finished:" + new Date() );		
		}catch(Exception ex){
			
		}
	}
}
