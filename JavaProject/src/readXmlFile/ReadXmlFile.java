package readXmlFile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;





public class ReadXmlFile {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FolderProcessor system = new FolderProcessor("C:\\xml", "xml");
		List<String> fileList = system.getFiles();
		System.out.println("Content size"+fileList.size());
		//domParser(fileList);
		JAXBPerser(fileList);
		
		

	}
	private static void domParser(List fileList)throws Exception{
		
		for(int i= 0; i< fileList.size(); i++){
			System.out.println("Content size"+fileList.get(i));
			String filePath = (String)fileList.get(i);
			File xmlFile = new File(filePath);
			
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			 
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		 
			NodeList nList = doc.getElementsByTagName("staff");
		 
			System.out.println("----------------------------");
		 
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Employee employee = new Employee();
				Node nNode = nList.item(temp);
		 
				System.out.println("\nCurrent Element :" + nNode.getNodeName());
		 
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
		 
					Element eElement = (Element) nNode;
					employee.setStaffId(eElement.getAttribute("id"));
					System.out.println("Staff id : " + eElement.getAttribute("id"));
					employee.setFirstname(eElement.getElementsByTagName("firstname").item(0).getTextContent());
					System.out.println("First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
					employee.setLastname(eElement.getElementsByTagName("lastname").item(0).getTextContent());
					System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
					employee.setNickname(eElement.getElementsByTagName("nickname").item(0).getTextContent());
					System.out.println("Nick Name : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
					employee.setSalary(eElement.getElementsByTagName("salary").item(0).getTextContent());
					System.out.println("Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());
		 
				}
			}
			
		}
	}
	private static void JAXBPerser(List fileList)throws Exception{
		for(int i= 0; i< fileList.size(); i++){
			System.out.println("Content size"+fileList.get(i));
			String filePath = (String)fileList.get(i);
			File xmlFile = new File(filePath);
			JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Employee Employee = (Employee) jaxbUnmarshaller.unmarshal(xmlFile);
			System.out.println(Employee);
		}

	}

}
class FolderProcessor{
	
	private final String path;
	private final String extension;
	public FolderProcessor(String path, String extension)
	{
	      this.path = path;
	      this.extension = extension;
	}
	
	public List getFiles(){
		List<String> list = new ArrayList<String>();
		File file = new File(path);
	    File content[] = file.listFiles();
	    System.out.println("Content size"+content.length);
		if (content != null)
	      {
	         for (int i = 0; i < content.length; i++)
	         {
	            if (content[i].isDirectory())
	            {
	               
	               
	            }
	            else
	            {
	               if (checkFile(content[i].getName()))
	               {
	                  list.add(content[i].getAbsolutePath());
	               }
	            }
	         }
	      }
	    return list;  
	}
	private boolean checkFile(String name)
	   {
	      return name.endsWith(extension);
	   }
}
class Employee{
	private String staffId;
	private String firstname;
	private String lastname;
	private String nickname;
	private String salary;
	
	public String getStaffId() {
		return staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
}
