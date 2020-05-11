package comparator;

public class EmployeeSortByName implements IEmployeeSortComparator{

	public int compare(Employee emp1, Employee emp2) {
				
		return emp1.getName().compareTo(emp2.getName());
	}

}
