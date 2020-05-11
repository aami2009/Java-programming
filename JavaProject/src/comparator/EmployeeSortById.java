package comparator;

public class EmployeeSortById implements IEmployeeSortComparator{

	public int compare(Employee emp1, Employee emp2) {
		return emp1.getId() - emp2.getId();
		
	}

}
