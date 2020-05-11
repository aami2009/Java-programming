package hashCodeAndEqual;

import java.util.*;
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	   	
	   Map<Object, Object> map = new TreeMap<Object, Object>();
	   Employee emp11 = new Employee("Tamal");
	   Set<Employee> set = new HashSet<Employee>();
	   Set set1 = new HashSet();
	   Employee emp2 = new Employee("Ranjan");
	   Employee emp3 = new Employee("Anirban");
	   Employee emp4 = new Employee("Goutam");
	   Employee emp5 = new Employee("Tamal");
	   
	   String emp12 = new String("Ashis");
	   String emp13 = new String("Ashis1");
	   //map.put(emp11, "12");
	   //System.out.println("Put emp1-------");
	   //map.put(emp5, "15");
	   //System.out.println("Put emp2-------");
	   //map.put(emp3, "56");
	   //System.out.println("Put emp3-------");
	   //map.put(emp4, "120");
	   //System.out.println("Put emp4-------");
	   //map.put(emp11, "13");
	   //System.out.println("Put emp1-------");  
	   //map.put(new Employee(), "Employee Key");
	   
	   /*set.add(emp11);
	   set.add(emp2);
	   set.add(emp3);
	   set.add(emp5);*/
	   
	   set1.add(emp11);
	   set1.add(emp5);
	   
	   Iterator it1 = set1.iterator();
	   
	   /*while(it1.hasNext()){
		  String str = (String)it1.next(); 
		  System.out.println("----------12"+str);
		  
	   }*/
	   
	   
	   
	  Iterator it = set1.iterator();
	   while(it.hasNext()){
		   Employee emp = (Employee)it.next();
		   System.out.println("Put emp3-------"+emp.getName());
	   }
	  
	   //System.out.println("----------"+map.get(new Employee()));
	   
	   Iterator itMap = map.entrySet().iterator();
	   while(itMap.hasNext()){
		   Map.Entry entry = (Map.Entry)itMap.next();
		   Employee emp = (Employee)entry.getKey();
		   String value = (String)entry.getValue();
		   System.out.println("=====================");
		   System.out.println(emp.getName());
		   System.out.println(value);
		   System.out.println("=====================");
	   }
	   
	   for(Iterator itMap1 = map.entrySet().iterator(); itMap.hasNext();){
		   Map.Entry entry =(Map.Entry) itMap1.next();
		   Employee emp = (Employee)entry.getKey();
		   String value = (String)entry.getValue();
	   }
	  
	} 
       

}
