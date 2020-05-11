package concurrentPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;;



public class ExecutorCallable {
    static List<Callable> listOfTask = new ArrayList<Callable>();
    static ExecutorService service = Executors.newFixedThreadPool(2);
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		listOfTask.add(new Task10());
		listOfTask.add(new Task20());
		listOfTask.add(new Task30());
        for(int i = 0; i< listOfTask.size(); i++){
        	Future future = service.submit(listOfTask.get(i));
        	System.out.println("Results"+future.get());
        }
        
        service.shutdown();
	}

}
class Task10 implements Callable{

	public Object call() throws Exception {
		// TODO Auto-generated method stub
		return "fail";
	}
	
	
}
class Task20 implements Callable{
	public Object call() throws Exception{
		return 2;
	}
}
class Task30  implements Callable{
	public Object call() throws Exception{
		return 3;
	}
}

