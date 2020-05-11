package json;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
 

public class ConvertListToGSON {

	public static void main(String[] args) {
		/*List<Pojo> foo = new ArrayList<Pojo>();
		Pojo pojo1 = new Pojo();
		Pojo pojo2 = new Pojo();
		
		pojo1.setName("Ashis");
		pojo1.setAddress("Address");
		
		pojo2.setName("Ashis100");
		pojo2.setAddress("Address100");
		
		foo.add(pojo1);
		foo.add(pojo2);
		
        String json = new Gson().toJson(foo );
		System.out.println(json);*/
		String xmlnsPattern = "\\s+xmlns\\s*(:\\w)?\\s*=\\s*\\\"(?<url>[^\\\"]*)\\\"";
		String xmlInput = "  <soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:web=\"http://litwinconsulting.com/webservices/\">\n"
	            + "   <soapenv:Header/>\n"
	            + "   <soapenv:Body>\n"
	            + "   <web:parent1>\n"
	            + "      <web:RETURNCODE>100 </web:RETURNCODE> \n"
	            + "   </web:parent1>\n"
	            + "      <web:parent2>\n"
	            + "         <!--Optional:-->\n"
	            + "         <web:City>%CITY%</web:City>\n"
	            + "      </web:parent2>\n"
	            + "   </soapenv:Body>\n"
	            + "  </soapenv:Envelope>";
		
				String json = new Gson().toJson(xmlInput);
				String json1 = removeXmlStringNamespaceAndPreamble(xmlInput);
				String json3 = new Gson().toJson(json1);
		System.out.println(json3);

	}
	 static String removeXmlStringNamespaceAndPreamble(String xmlString) {
		  return xmlString.replaceAll("(<\\?[^<]*\\?>)?", ""). /* remove preamble */
		  replaceAll("xmlns.*?(\"|\').*?(\"|\')", "") /* remove xmlns declaration */
		  .replaceAll("(<)(\\w+:)(.*?>)", "$1$3") /* remove opening tag prefix */
		  .replaceAll("(</)(\\w+:)(.*?>)", "$1$3"); /* remove closing tags prefix */
		}



}
class Pojo{
	private String name = "";
	private String address = "";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}