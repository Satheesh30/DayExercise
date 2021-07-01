package day24;



public class TwoThread {
	public static void main(String[] args) {
		Canon ca=new Canon();
		Shooting sh=new Shooting(ca);
		Thread subramain=new Thread(sh,"subramain");
		Thread vinoth=new Thread(sh,"vinoth");
		
		subramain.start();
		vinoth.start();
	}

}
class Canon{
	boolean flag;
   synchronized	public void fill() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		if(flag) {
			try {wait();}catch(Exception e) {}
		}
		System.out.println(name+" fill gun..");
		flag=true;
		notify();
	}
  synchronized	public void shoot() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		if(!flag) {
			try {wait();}catch(Exception e) {}
		}
		System.out.println(name+" shoot the gun..");
		flag=false;
		notify();
	}
}
class Shooting implements Runnable{
	Canon gun;
	public Shooting(Canon gun) {
		// TODO Auto-generated constructor stub
		this.gun=gun;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		if(t.getName().equals("subramain")) {
			for(int i=0;i<5;i++) {
				gun.fill();
			}
		}
			else if(t.getName().equals("vinoth")) {
				for(int i=0;i<5;i++) {
					gun.shoot();;
				}
		}
	}
}