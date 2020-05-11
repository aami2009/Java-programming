package exception;

public class AuthenticationException extends GenericException{
   public static final String INVALID_USERNAME_OR_PASSWORD ="Either your username or password was not recognised.";
   
   public AuthenticationException(){
	   
   }
   public AuthenticationException(String message){
	   super(message);
	   System.out.println("AuthenticationException");
   }
   public AuthenticationException(String message, Throwable cause){
	   
   }
}
