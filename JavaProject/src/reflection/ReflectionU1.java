package reflection;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class ReflectionU1 {
    private static Map<String,Field> map = new HashMap<String,Field>();
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		map.put("name", null);
		map.put("age", null);
		Field[] fields = pojo.class.getDeclaredFields();
		System.out.println("Field"+fields[0]);
		System.out.println("Field"+fields[1]);
		for(int i = 0; i < fields.length; i++){
			if(map.containsKey(fields[i].getName())){
				map.put(fields[i].getName(), fields[i]);
				System.out.println("fields[i].getName():"+""+fields[i].getName());
				System.out.println("fields[i]:"+""+fields[i]);
			}
		}
		ReflectionU1 reflectionU1 = new ReflectionU1();
		reflectionU1.setPropertyValues("age", 12);
	}
	int setPropertyValues(String property,Object value) throws IllegalArgumentException, IllegalAccessException{
		Field fields = (Field)map.get(property);
		if(null != fields){
			fields.set(this, value);
		}
		return 0;
		
	}

}
class pojo{
	private String name = "Ravi";
	public int age = 12;
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
}
