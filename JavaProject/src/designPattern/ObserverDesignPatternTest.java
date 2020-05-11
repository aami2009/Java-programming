package designPattern;

import java.util.Observable;
import java.util.Observer;

public class ObserverDesignPatternTest {

	public static void main(String[] args) {
		
        TicketStateSubject observable = new TicketStateSubject(null);
		
		CbusEmailObserver cbusEmailObserver = new CbusEmailObserver();
		CbusSMSObserver cbusSMSObserver = new CbusSMSObserver();
		CbusIVRObserver cbusIVRObserver = new CbusIVRObserver();
		
		observable.addObserver(cbusEmailObserver);
		observable.addObserver(cbusSMSObserver);
		observable.addObserver(cbusIVRObserver);
		
		observable.setTicketState("Ticket state has been changed ");
		//observable.setWeather("Ticket state has been changed!!");

	}

}
class TicketStateSubject extends Observable{
	private String ticketState;

	public TicketStateSubject(String ticketState)
	{
		this.ticketState = ticketState;
	}

	public String getTicketState()
	{
		return ticketState;
	}
    public void setTicketState(String ticketState)
	{
		this.ticketState = ticketState;
		setChanged();
		notifyObservers();
	}

}
class CbusEmailObserver implements Observer{
     private TicketStateSubject ticketStateSubject ;
     public void update(Observable observable, Object arg)
	 {
		ticketStateSubject = (TicketStateSubject) observable;
		System.out.println("CbusEmailObserver"+ticketStateSubject.getTicketState());
	 }
}
class CbusSMSObserver implements Observer{
    private TicketStateSubject ticketStateSubject ;
    public void update(Observable observable, Object arg)
	{
		ticketStateSubject = (TicketStateSubject) observable;
		System.out.println("CbusSMSObserver"+ticketStateSubject.getTicketState());
	}
}
class CbusIVRObserver implements Observer{
      private TicketStateSubject ticketStateSubject ;
      public void update(Observable observable, Object arg)
	 {
		ticketStateSubject = (TicketStateSubject) observable;
		System.out.println("CbusIVRObserver"+ticketStateSubject.getTicketState());
	 }
}
