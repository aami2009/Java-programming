package multithreading.job;

public class AdditionJob implements Runnable,Job{
   private boolean flag=false;	
   public void run(){
	   
   }
public AdditionJob(){
	
}
public void handleJob() {
	System.out.println("handleJob AdditionJob");
	InputMessage msg=InputMessage.getInstance();
	msg.increment();
}

public boolean isUsed() {
	// TODO Auto-generated method stub
	return false;
}

public void setFlag(boolean flag) {
	// TODO Auto-generated method stub
	this.flag = flag;
}
}
