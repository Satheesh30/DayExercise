package day23;

public class TwoThreadDemo {

	public static void main(String[] args) {
		
		ReservationCounter central=new ReservationCounter();
		
		Thread vinoth = new Thread(new Threadjob1(central,1000),"vinoth");
		Thread subramain=new Thread(new Threadjob1(central,500),"subramain");
		vinoth.start();
		subramain.start();
	}

}
class Threadjob1 implements Runnable{
	ReservationCounter centra ;
	int amt;
	public Threadjob1(ReservationCounter central,int amt) {
		
		this.centra=central;
		this.amt=amt;
		
	}
	@Override
	
	public void run() {
		synchronized (centra) {
		centra.bookTicket(amt);
		centra.givechange();
		}
		
	}
}
class ReservationCounter{
	int amt;
	void bookTicket(int amt) {
		Thread s=Thread.currentThread();
		this.amt=amt;
		String name=s.getName();
		System.out.println(name+" has come to book ticket..");
		System.out.println(name+" brougth is : "+amt);
	}
	void givechange() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(" change given to... ");
		System.out.println(name+" take.. "+(amt-100));
	}
}
