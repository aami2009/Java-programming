package exception;

public abstract class GenericException extends Exception{
   private Object parameter;	
   public GenericException(){
	   
   }
   public GenericException(String message){
	   super(message);
   }
   public GenericException(String message, Throwable throwable){
	   super(message, throwable);
   }
   public GenericException(String message, Throwable throwable, Object parameter){
	  super(message, throwable);
	  this.parameter = parameter;
   }
   public String getMessage1(){
	   return (String)this.parameter;
   }
   
}
