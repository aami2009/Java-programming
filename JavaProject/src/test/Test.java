package test;

import java.util.HashMap;
import java.util.*;
import java.lang.reflect.*;
public class Test {

	public static void main(String[] args) {
		WorkListBean workListBean = new WorkListBean();
		Map<String,Object> map = new HashMap<String,Object>();
		TicketBeanCm ticketBean1CM = new TicketBeanCm("ashis","123");
		TicketBeanCm ticketBean2CM = new TicketBeanCm("asd","526");
		TicketBean ticketBean1 = new TicketBean("", "");
		TicketBean ticketBean2 = new TicketBean("", "");
		ticketBean1.setTicketBeanCm(ticketBean1CM);
		ticketBean2.setTicketBeanCm(ticketBean2CM);
		List<TicketBean> list = new ArrayList<TicketBean>();
		list.add(ticketBean1);
		list.add(ticketBean2);
		workListBean.setTicketBean(list);
		map.put("workListBean", workListBean);
        //getList(map);
        getSetFields();
	}
	static void getList(Map<String,Object> map){
		//Set set = map.keySet();
		//TicketBean ticketBean = map.;
		Set set = map.entrySet();
	    Iterator i = set.iterator();
	      // Display elements
	      //while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         System.out.println(me.getKey() + ": ");
	         System.out.println(me.getValue());
	         WorkListBean workListBean =(WorkListBean) me.getValue();
	         List<TicketBean> list = workListBean.getTicketBean();
	         System.out.println(list.get(0).getTicketBeanCm().getName());
	         System.out.println(list.get(0).getTicketBeanCm().getAge());
	         System.out.println(list.get(1).getTicketBeanCm().getName());
	         System.out.println(list.get(1).getTicketBeanCm().getAge());
	      //}
	}
	static void getSetFields(){
		try {
            Class cls = Class.forName("test.TicketBeanCm");

            Field fieldlist[] 
              = cls.getDeclaredFields();
            for (int i 
              = 0; i < fieldlist.length; i++) {
               Field fld = fieldlist[i];
               System.out.println("name= " + fld.getName());
               //System.out.println("decl class = " +fld.getDeclaringClass());
               //System.out.println("type= " + fld.getType());
               //int mod = fld.getModifiers();
               //System.out.println("modifiers = " +Modifier.toString(mod));
               System.out.println("-----");
            }
          }
          catch (Throwable e) {
             System.err.println(e);
          }
	}
}
class WorkListBean{
	private List<TicketBean> ticketBean;

	public List<TicketBean> getTicketBean() {
		return ticketBean;
	}

	public void setTicketBean(List<TicketBean> ticketBean) {
		this.ticketBean = ticketBean;
	}
}
class TicketBean{
	TicketBean(String name,String age){
		this.name = name;
		this.age = age;
	}
	private TicketBeanCm ticketBeanCm;
	public TicketBeanCm getTicketBeanCm() {
		return ticketBeanCm;
	}
	public void setTicketBeanCm(TicketBeanCm ticketBeanCm) {
		this.ticketBeanCm = ticketBeanCm;
	}
	private String name;
	private String age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
}
class TicketBeanCm{
	TicketBeanCm(String name,String age){
		this.name = name;
		this.age = age;
	}
	private String name;
	private String age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
}

