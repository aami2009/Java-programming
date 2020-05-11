package exception;

public class ActionException extends GenericException{
   public static final String INVALID_SERVLET_PATH ="Invalid Servlet Path";
   
   public ActionException(String message){
	   super(message);
   }
   public ActionException(String message, Throwable throwable){
	   super(message, throwable);
   }
   public ActionException(String message, Throwable throwable, Object parameters)
	{
		super(message, throwable, parameters);
	}	
}
