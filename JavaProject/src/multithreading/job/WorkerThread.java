package multithreading.job;

public class WorkerThread extends Thread {
  Server server;
  public WorkerThread(Server server, String name){
	  this.server = server;
	  Thread workerThread = new Thread(this,name);
	  workerThread.start();
  }
  public void run(){
	  System.out.println(Thread.currentThread().getName());
	  while(true){
		  Job task = server.getJob();
		  if(task != null){
			 task.handleJob(); 
		  }
	  }
  }
}
