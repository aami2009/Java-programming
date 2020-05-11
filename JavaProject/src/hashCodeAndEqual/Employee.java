package hashCodeAndEqual;

public class Employee {
    private int id = 0;
    private String name = "";
    private int age = 0;
    public Employee(){
    	
    }
    public Employee(String name){
    	this.name = name;
    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int hashCode(){
		//System.out.println("hashCode-------"+this.name.length());
		Double dl = Math.random();
		int hashCodeValue = dl.intValue();
		return this.name.length();
	}
	public boolean equals(Object obj){
		if((obj instanceof Employee) && ((Employee)obj).name == name){
			//System.out.println("equals True-------");
			return true;
		}else{
			//System.out.println("equals  False-------");
			return false;
		}
	}
}
