package day22;

public class ThreadDemo3 {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		t.setName("satheesh");
		System.out.println("Reservation counter  starting working "+t.getName());
		ReservationCounter central=new ReservationCounter();
		
		Thread vinoth = new Thread(new Bookingjob(central,1000),"vinoth");
		Thread subramain=new Thread(new Bookingjob(central,500),"subramain");
		vinoth.start();
		subramain.start();
	}

}
class Bookingjob implements Runnable{
	ReservationCounter central ;
	int amt;
	public Bookingjob(ReservationCounter central,int amt) {
		this.central=central;
		this.amt=amt;
		
	}
	@Override
	
	public void run() {
		central.bookTicket(amt);
		central.givechange();
		
	}
}
class ReservationCounter{
	int amt;
	void bookTicket(int amt) {
		Thread t=Thread.currentThread();
		this.amt=amt;
		String name=t.getName();
		System.out.println(name+" has come to book ticket..");
		System.out.println(name+" brougth "+amt);
	}
	void givechange() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(" change given to... "+name);
		System.out.println(name+" take.. "+(amt-100));
	}
}