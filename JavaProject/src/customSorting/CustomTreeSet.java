package customSorting;

import java.lang.Comparable;
import java.util.*;

import comparator.Employee;
public class CustomTreeSet{
    
	
	public static void main(String[] args ){
		Set<Employee> treeSet = new TreeSet<Employee>(new SortbyName());
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		
		emp1.setId(1);
		emp1.setName("Tamal");
		emp1.setAge(28);
		
		emp2.setId(2);
		emp2.setName("Anirban");
		emp2.setAge(30);
		
		emp3.setId(3);
		emp3.setName("Partha");
		emp3.setAge(25);
		
		
		
		treeSet.add(emp1);
		treeSet.add(emp2);
		treeSet.add(emp3);
		
		for(Employee emp : treeSet){
			System.out.println("----"+emp.getName());
		}
	}
	
	
}
class SortbyName implements Comparator<Employee>{
	public int compare(Employee emp1, Employee emp2){
		return emp1.getName().compareTo(emp2.getName());
	}
}
class SortbyName1 implements Comparable<Employee>{

	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
