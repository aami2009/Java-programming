package comparator;

public class EmployeeSortByAge implements IEmployeeSortComparator{
   public int compare(Employee emp1, Employee emp2){
	   return emp1.getAge() - emp2.getAge();
   }
}
