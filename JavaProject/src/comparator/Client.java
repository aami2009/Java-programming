package comparator;

import java.util.*;
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
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
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		
		/*Set<Employee> set = new TreeSet<Employee>();
		set.add(emp1);
		set.add(emp2);
		set.add(emp3);*/
		
		//System.out.println(set);
		
		IEmployeeSortComparator employeeSortComparator = EmployeeSortFactory.getInstance().getSortTypeInstance(2);
		
		Collections.sort(list, employeeSortComparator);
		
		Iterator it = list.iterator();
		
		while(it.hasNext()){
			Employee emp = (Employee)it.next();	
			System.out.println("Id--->"+emp.getId());
			System.out.println("Name--->"+emp.getName());
			System.out.println("Age--->"+emp.getAge());
		}
		
	}

}
