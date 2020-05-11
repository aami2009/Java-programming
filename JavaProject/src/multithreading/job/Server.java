package multithreading.job;

import java.util.ArrayList;
import java.util.List;

public class Server {
   List jobQueue;
   int THREAD_POOL_SIZE = 2;
   public static void main(String args[]){
	    Server server =new Server();
		server.init();
		server.start();
		
   }
   public void init(){
	    jobQueue = new ArrayList();
	    jobQueue.add(new AdditionJob());
		jobQueue.add(new SubstractJob());
	    jobQueue.add(new AdditionJob());
		jobQueue.add(new AdditionJob());
		/*jobQueue.add(new SubstractJob());
		jobQueue.add(new SubstractJob());
		jobQueue.add(new AdditionJob());*/
	  
   }
   public void start(){
	   for(int i = 1; i <= THREAD_POOL_SIZE; i++ ){
		   WorkerThread WorkerThread = new WorkerThread(this,"I am worker Thread"+i);   
	   }
   }
   public Job getJob(){
		synchronized (jobQueue) {
			Job task=null;
			if (jobQueue.size() > 0) {
			 task = (Job) jobQueue.get(0);
			jobQueue.remove(0);	
			if (jobQueue.size() == 0) {
				//System.out.println("There is last pending Job in jobQueue");
			
			}
			
			}
			return task;
		}
		
	}
	
}

