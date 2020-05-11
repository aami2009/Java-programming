package designPattern;

public class SingletonDP {

	public static void main(String[] args) {
		Singleton Singleton = new Singleton();
		Singleton.display();

	}

}
final class Singleton{
	static public void display(){
		System.out.println("Display________");
	}
}
