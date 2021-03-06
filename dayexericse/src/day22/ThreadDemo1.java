package day22;

import java.util.Date;

public class ThreadDemo1 {
	public static void main(String[] args) throws Exception{
		VaccinationCenter vc=new VaccinationCenter();
		Thread t=Thread.currentThread();
		t.setName("satheesh");
		System.out.println(new Date());
		System.out.println("Before comming to class....");
		Thread josh=new Thread(new JobToJosh(vc));
		josh.setName("josh");
		josh.start();
		//vc.getToken();
		System.out.println("Take class.....for 7-9 Golden Batch...."+new Date());
	}	
}
class JobToJosh implements Runnable{
	VaccinationCenter vc;
	public JobToJosh(VaccinationCenter vc) {
		this.vc=vc;
	}
@Override
	public void run() {
		System.out.println("The job given to josh is executed from this method...");
		try{
			vc.getToken();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}	
}class VaccinationCenter {
	public void getToken() throws Exception{
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+"...standing in queue for token....");
		Thread.sleep(10000);
		System.out.println("token received..."+new Date());
	}
}
