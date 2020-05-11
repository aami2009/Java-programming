package priorityQue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQue {

	public static void main(String[] args) {
		PriorityQueue<Patient> priorityQueue = new PriorityQueue<Patient>(10, new Comparator<Patient>(){
			public int compare(Patient patient1, Patient patient2){
				//return (patient1.isEmergencyCase() == patient2.isEmergencyCase()) ? (Integer.valueOf(patient1.getId()).compareTo(patient2.getId()))
                        //: (patient1.isEmergencyCase() ? -1 : 1);
				if(patient1.isEmergencyCase() == patient2.isEmergencyCase()){
					System.out.println("1"+patient1.isEmergencyCase()+ "And "+patient2.isEmergencyCase());
					return (Integer.valueOf(patient1.getId()).compareTo(patient2.getId()));
				}
				else if(patient1.isEmergencyCase()){
					System.out.println("2"+patient1.isEmergencyCase()+ "And "+patient2.isEmergencyCase());
					return -1;
				}else{
					//System.out.println("3"+patient1.isEmergencyCase()+ "And "+patient2.isEmergencyCase());
					return 1;
				}
                /*if(patient1.isEmergencyCase() == patient2.isEmergencyCase()){
                	System.out.println("1");
                	//return 1;
                	return (Integer.valueOf(patient1.getId()).compareTo(patient2.getId()));
                }else{
                	return (Integer.valueOf(patient2.getId()).compareTo(patient1.getId()));
                }*/
                /*else if(patient1.isEmergencyCase()){
                	System.out.println("2");
                	return -1;
                }else{
                	System.out.println("3");
                	return 1;
                }*/
				/*if(patient1.isEmergencyCase()){
					return -1;
				}else if(patient2.isEmergencyCase()){
					return 1;
				}else{
					return 0;
				}*/
			}
		});
		priorityQueue.add(new Patient(1,"Patient1",true));
		priorityQueue.add(new Patient(2,"Patient2",false));
		priorityQueue.add(new Patient(3,"Patient3",true));
		priorityQueue.add(new Patient(4,"Patient4",false));
		priorityQueue.add(new Patient(5,"Patient5",false));
		priorityQueue.add(new Patient(6,"Patient6",true));
		while(true){
			Patient patient = priorityQueue.poll();
			if(patient == null){
				break;
			}
			System.out.println(patient.getName() + " <-- ");
			
		}

	}

}
class Patient{
	private int id;
	private String name;
	private boolean isEmergencyCase;
	public Patient(int id, String name, boolean emergencyCase) {
	    this.id = id;
	    this.name = name;
	    this.isEmergencyCase = emergencyCase;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isEmergencyCase() {
		return isEmergencyCase;
	}
	public void setEmergencyCase(boolean isEmergencyCase) {
		this.isEmergencyCase = isEmergencyCase;
	}
	
	
	
}
