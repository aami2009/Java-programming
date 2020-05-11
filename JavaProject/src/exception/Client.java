package exception;

import java.lang.reflect.Array;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.Collections;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Collection list = new Vector();
		list.add("Tamal");
		list.add("Ashis");
		list.add("Ranjan");
		
		//Collections.sort((List)list) ;
		//System.out.println("=====Error====="+list);
		try{
		checkUserAndPassword("admin1");
		//checkServletPath("metadatadefinitiontest.action");
		}catch(GenericException ex){
			//System.out.println("Path===="+""+ex.getMessage1()+"=="+"Error:"+ex.getMessage());
			//ex.printStackTrace();
		}
		
		try{
			MultipleException me = new MultipleException();
			Map map = new HashMap();
			map.put("parameter1", "");
			map.put("parameter2", "");
			
			me = multifieldValidation(map, me);
			if(me != null){
				throw me;
			}
			}catch(GenericException ex){
				
			MultipleException me = (MultipleException)ex;
			System.out.println("=====Error=====");
			for(int i = 0; i < me.getExceptionCount(); i++){
				System.out.println(me.getException(i));
			}
			System.out.println("=====Error=====");
		}
	}
	private static void checkUserAndPassword(String userName) throws GenericException{
        if(userName.equals("admin")){
		}else{
			throw new AuthenticationException(AuthenticationException.INVALID_USERNAME_OR_PASSWORD);
		}
	}
	private static void checkServletPath(String servletPath) throws GenericException{
		int lastDotPos = servletPath.lastIndexOf('.');
		int lastSlashPos = servletPath.lastIndexOf('/');
		if(lastDotPos == -1 || lastSlashPos == -1 || lastDotPos < lastSlashPos){
			throw new ActionException(ActionException.INVALID_SERVLET_PATH, null, servletPath);
		}
	}
	private static MultipleException multifieldValidation(Map params, MultipleException me) throws GenericException{
		String emailAddress = (String)params.get("parameter1");
		String invalidPassword = (String)params.get("parameter2");
		if((emailAddress.equals(null) || emailAddress.equals("") || emailAddress.length()==0)) {
			
			GeneralException generalException = new GeneralException(GeneralException.INVALID_EMAIL_ADDRESS);
			me.addException(generalException);
		}
		if(invalidPassword.equals(null) || invalidPassword.equals("") || invalidPassword.length() == 0){
			GeneralException generalException = new GeneralException(GeneralException.INVALID_PASSWORD);
			me.addException(generalException);
		}
		return me;
	}

}
