package exception;


import java.util.*;

/**
 * Holds one or more multiple class instance. It is Ideal for form validation where more than
 * one field may be wrong with the user entered data. MultipleExceptions can
 * be added to each other. All the underlying exceptions are combined so that
 * they may be displayed in one long list to the user.
 */
public class MultipleException extends GenericException {
   private List mException = new ArrayList();
   
   public MultipleException(){
	   
   }
   public MultipleException(GenericException ge){
	   
   }
   public void addException(GenericException exception){
	   if(exception instanceof MultipleException){
		   MultipleException mException =(MultipleException)exception;
		   if(mException != null){
			 System.out.println("------addall----------");  
			 this.mException.addAll(this.mException);  
		   }
	   }else{
		   System.out.println("------add----------");
		   this.mException.add(exception);
	   }
   }
   public GenericException getException(int index){
	   return (GenericException)this.mException.get(index);
   }
   public int getExceptionCount(){
	   return this.mException.size();
   }
}
