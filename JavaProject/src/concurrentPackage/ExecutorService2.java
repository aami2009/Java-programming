package concurrentPackage;

import java.util.ArrayList;
import java.util.concurrent.*;

public class ExecutorService2 {
	//private List<MessageReceiver> receivers = new ArrayList<MessageReceiver>();
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
        	Callable worker = new WorkerThread1("" + i);
        	Future future = executor.submit(worker);
        	System.out.println("Results"+future.get());
            //executor.execute(worker);
          }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
    }
}
class WorkerThread1 implements Callable {
	  
    private String command;
    
    public WorkerThread1(String s){
        this.command=s;
    }

   private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString(){
        return this.command;
    }

    public Object call() throws Exception {

		System.out.println(Thread.currentThread().getName()+" Start. Command = "+command);
        processCommand();
        System.out.println(Thread.currentThread().getName()+" End.");
        return "fail";
	}
}
