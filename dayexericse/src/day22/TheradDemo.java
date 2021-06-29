package day22;

public class TheradDemo {
public static void main(String[] args)throws Exception {
	Thread t= Thread.currentThread();
	System.out.println();
	t.setName("main..");
	t.setPriority(10);
	System.out.println("start class...");
	for (int i=0;i<5;i++) {
		System.out.println(i);
		Thread.sleep(1000);
	}
	
	met();
}
static void met()throws Exception {
	System.out.println("met before call");
	Thread.sleep(5000);
	System.out.println("met after called...");
}
}
