package comparator;

public class EmployeeSortFactory {
	
	private final static EmployeeSortFactory EmployeeSortFactory = new EmployeeSortFactory();
	private EmployeeSortFactory(){}
	public static EmployeeSortFactory getInstance(){
		return EmployeeSortFactory;
	}
    public static IEmployeeSortComparator getSortTypeInstance(int sortType){
    	if(sortType == 1){
    		return new EmployeeSortById();
    	}
    	if(sortType == 2){
    	return new EmployeeSortByName();
    	}
    	if(sortType == 3){
        	return new EmployeeSortByAge();
        }else{
        	return null;
        }
        	
    }
}
