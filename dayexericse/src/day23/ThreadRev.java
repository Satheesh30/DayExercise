package day23;

public class ThreadRev {
public ThreadRev() {
	Thread t= new Thread(new Threadjob());
	t.start();
}
		public static void main(String[] args) {
			Thread t=Thread.currentThread();
			new ThreadRev();
		//	System.out.println(t);
			for(int i=0;i<5;i++) {
				System.out.println(i);
				try {
				Thread.sleep(1000);
				}catch(Exception e) {
					
				}
				
			}
		}
}
class Threadjob implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread t= Thread.currentThread();
		System.out.println("curret tread..");
	}}
	

