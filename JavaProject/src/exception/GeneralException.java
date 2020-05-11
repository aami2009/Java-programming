package exception;

public class GeneralException extends GenericException {
	public static final String INVALID_EMAIL_ADDRESS = "Invalid Email Address";
	public static final String INVALID_PASSWORD = "Invalid Password"; 
	public GeneralException(final String message)
	{
		super(message);
	}

	public GeneralException(final String message, Throwable cause, Object parameters)
	{
		super(message, cause, parameters);
	}
	public GeneralException(final String message, final Throwable cause, final Object parameters, final boolean emailable)
	{
		super(message, cause, parameters);
		
	}
}
