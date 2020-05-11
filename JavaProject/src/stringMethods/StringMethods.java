package stringMethods;

public final class StringMethods {
	private static char value[] = new char[10] ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringMethods str = new StringMethods();
		String test = "Ashis";
		value = test.toCharArray();
		//test.lastIndexOf(ch);
		str.charAt(0);
		//str.isEmpty();

	}
	private void isEmpty(){
		
		if(value.length == 0){
		  	
		}
	}
	private int lastIndex(){
		return value.length - 1;
	}
	private int firstIndex(){
		return value[0];
	}
	private char charAt(int index){
		System.out.println("CharAt"+value[index]);
		return value[index];
		
	}

}

