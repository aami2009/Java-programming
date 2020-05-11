package multithreading.job;

public class SubstractJob implements Runnable,Job{
    private boolean flag=false;
	public void run() {
		// TODO Auto-generated method stub
		
	}

	public void handleJob() {
		System.out.println("handleJob SubstractJob");
		InputMessage msg=InputMessage.getInstance();
		msg.decrement();
		
	}

	public boolean isUsed() {
		// TODO Auto-generated method stub
		return false;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
		
	}

}
