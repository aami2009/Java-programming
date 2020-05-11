package multithreading;

public class AccountDanger implements Runnable{

	/**
	 * @param args
	 */
	private Account account = new Account();
	public static void main(String[] args) {
		AccountDanger accountDanger = new AccountDanger();
        Thread one = new Thread(accountDanger);
        Thread two = new Thread(accountDanger);
        Thread three = new Thread(accountDanger);
        Thread four = new Thread(accountDanger);
        one.setName("Tamal");
        two.setName("Annirban");
        two.setPriority(10);
        three.setName("Goutam");
        four.setName("Ranjan");
        two.start();
        one.start();
       
        try{
         one.join();
         
        }catch(InterruptedException ex){
        	
        }
        
        //three.start();
        //four.start();
	}
	public void run(){
		System.out.println("----------------------");
		int j = 0;
		while(j < 3){
			System.out.println("Counter"+""+j);
			makeWithdrawl(10);
			if(account.getBalance() < 0){
				System.out.println("Account is overdrawn!!!!");
			}
			j++;
		}
	}
	private synchronized void makeWithdrawl(int amount){
		if(account.getBalance() >= amount){
			System.out.println(Thread.currentThread().getName()+":"+ " is going to withdrawal"+ "=="+Thread.currentThread().getPriority());
		
		try{
			Thread.sleep(500);
		}catch(InterruptedException ex){}
			account.withDraw(amount);
			System.out.println(Thread.currentThread().getName()+ ":"+ "compleates the withdrawal"+account.getBalance());
		}else{
			System.out.println("Not enough in account for "+ Thread.currentThread().getName() + "to withdraw"+ account.getBalance());
		}
	}
  
}
class Account{
	private int balance = 50;
	public int getBalance(){
		return this.balance;
	}
	public void withDraw(int amount){
		this.balance = balance - amount;
	}
}