package designPattern;

public class Main {
	public static void add()
	   {
	      ObservableValue ov = new ObservableValue(0);
	      TextObserver to = new TextObserver(ov);
	      ov.addObserver(to);
	   }
	   public static void main(String [] args)
	   {
		  System.out.println("hfhzfj");
		  
	      Main m = new Main();
	      m.add();
	   }
}
