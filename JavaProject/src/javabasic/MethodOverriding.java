package javabasic;

public class MethodOverriding {

	public static void main(String[] args) {
		Parent ch = new Child();
		ch.a();
		ch.b();
		Child ch1 = new Child();
		//ch1.a();
		ch1.b();
	}

}
class Parent{
	static void a() throws NumberFormatException{
		System.out.println("Parent a");
	}
	void b(){
		System.out.println("Parent b");
	}
}
class Child extends Parent{
	/*static void a()throws Exception{
		System.out.println("child a");
	}
	void b(){
		System.out.println("child b");
	}*/
}
