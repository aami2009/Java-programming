package designPattern;

public class AdapterDesign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class EnumIteratorAdapter implements Iterator{
    private Enumaration enumaration;
	public void hasNext() {
		enumaration.hasNext();
		
	}

	public void next() {
		enumaration.next();
		
	}

	public void remove() throws Exception{
		throw new Exception();// TODO Auto-generated method stub
		
	}
	
}
interface Iterator{
	void hasNext();
	void next();
	void remove() throws Exception;
}
interface Enumaration{
	void hasNext();
	void next();
}
