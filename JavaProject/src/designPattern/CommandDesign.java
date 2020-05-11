package designPattern;

public class CommandDesign {

	public static void main(String[] args) {
		Singleton Singleton = new Singleton();
		String serverType = "tomcat";
		Receiver  receiver = ReceiverFactory.getInstance().getreceiverInstance(serverType);
		CommandFactory.setReceiver(receiver);
		String commandType = "stop";
		Command command = CommandFactory.getInstance().getInstance(commandType);
		RemoteControl RemoteControl = new RemoteControl(command);
		RemoteControl.start();

	}

}
class ReceiverFactory{
	private final static ReceiverFactory receiverFactory = new ReceiverFactory();
	private ReceiverFactory(){}
	public static ReceiverFactory getInstance(){
		return receiverFactory;
	}
	public Receiver getreceiverInstance(String serverType){
		if("jboss".equalsIgnoreCase(serverType)){
			return new JbossReceiverImpl();
		}
		if("tomcat".equalsIgnoreCase(serverType)){
			return new TomcatReceiverImpl();
		}
		return null;
	}
}
class CommandFactory{
	private final static CommandFactory commandFactory = new CommandFactory();
	private static Receiver receiver;
	private CommandFactory(){}
	public static CommandFactory getInstance(){
		return commandFactory;
	}
	public static void setReceiver(Receiver receiver1){
		receiver = receiver1;
	}
	public Command getInstance(String commandType){
		if("start".equalsIgnoreCase(commandType)){
			return new ServerStartCommand(receiver); 
		}if("stop".equalsIgnoreCase(commandType)){
			return new ServerStopCommand(receiver);
		}
		return null;
	}
}
class RemoteControl{
	Command command;
	public RemoteControl(Command command){
		this.command = command;
	}
	public void start(){
		command.execute();
	}
	public void stop(){
		command.execute();
	}
}
interface Command{
	void execute();
}
class ServerStartCommand implements Command{
	Receiver receiver;
	public ServerStartCommand(Receiver receiver){
		this.receiver = receiver;
	}
	public void execute(){
		receiver.start();
	}
}
class ServerStopCommand implements Command{
	Receiver receiver;
	public ServerStopCommand(Receiver receiver){
		this.receiver = receiver;
	}
    public void execute(){
    	receiver.stop();
	}
}
interface Receiver{
	void start();
	void stop();
	//void restart();
	
}
class JbossReceiverImpl implements Receiver{

	public void start() {
		System.out.println("Jboss start...");
		
	}

	public void stop() {
		System.out.println("Jboss stop...");
		
	}

	public void restart() {
		// TODO Auto-generated method stub
		
	}
	
}
class TomcatReceiverImpl implements Receiver{

	public void start() {
		System.out.println("Tomcat start...");
		
	}

	public void stop() {
		System.out.println("Tomcat stop...");
		
	}

	public void restart() {
		// TODO Auto-generated method stub
		
	}
	
}