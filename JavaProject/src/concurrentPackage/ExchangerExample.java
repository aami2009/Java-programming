package concurrentPackage;

import java.util.concurrent.Exchanger;
public class ExchangerExample {

	public static void main(String[] args) {
		Exchanger<String> exchange = new Exchanger<String>();
		Thread t1 = new MyThread10(exchange,"I like coffee");
		Thread t2 = new MyThread11(exchange,"I like tea");
		t1.start();
		t2.start();

	}

}
class MyThread10 extends Thread{
	Exchanger<String> exchanger;
	String message;
	MyThread10(Exchanger<String> exchanger,String message){
		this.exchanger = exchanger;
		this.message = message;
	}
	public void run(){
		    System.out.println(this.getName() + " message: " + message);
		try{
		    message = exchanger.exchange(message);
		    System.out.println(this.getName() + " message: " + message);    
		}catch(Exception ex){
			
		}
	}
}
class MyThread11 extends Thread{
	Exchanger<String> exchanger;
	String message;
	MyThread11(Exchanger<String> exchanger,String message){
		this.exchanger = exchanger;
		this.message = message;
	}
	public void run(){
		    System.out.println(this.getName() + " message: " + message);
		try{
		    message = exchanger.exchange(message);
		    System.out.println(this.getName() + " message: " + message);    
		}catch(Exception ex){
			
		}
	}
}
