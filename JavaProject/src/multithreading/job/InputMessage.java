package multithreading.job;

public class InputMessage {
	
    private int x = 10;
    private int y = 20;
    private static InputMessage inputMessage = new InputMessage();
    private InputMessage(){}
    public static InputMessage getInstance(){
	   return inputMessage;
    }
	public synchronized  void  increment()
	{
		System.out.println("increment"+Thread.currentThread().getName());
			x=x+1;
			y=y+1;
		System.out.println("AdditionJob performs = x:"+x+ " y:"+y);
	}
	public synchronized  void decrement()
	{
		System.out.println("decrement"+Thread.currentThread().getName());
		    x=x-2;
			y=y-2;
		System.out.println("SubstractJob performs = x:"+x+ " y:"+y);
	}   
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
