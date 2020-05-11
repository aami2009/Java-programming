/**
 * 
 */
package designPattern;
import java.sql.*;  
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author banik
 *
 */
public class ServiceLocator {
	private static Map cache = null;

	/**
	 * 
	 */
	public ServiceLocator() {
		System.out.println("ServiceLocator");
		cache = Collections.synchronizedMap( new HashMap() );
	}

	/**
	 * @param args
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ServiceLocator serviceLocator = new ServiceLocator();
		if (cache.containsKey("mysqlConnection")) {
			System.out.println(cache.containsKey("mysqlConnection"));
		}else{
			Connection con = MySQLConnection.creatConnection();
			cache.put("mysqlConnection", con);
		}

	}
	

}
class MySQLConnection{
	public static Connection creatConnection() throws ClassNotFoundException, SQLException{
		
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/videoneticspurchase","root","root");  
		return con;
		
	}
}
