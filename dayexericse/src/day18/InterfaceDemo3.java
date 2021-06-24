package day18;

public class InterfaceDemo3 {
	public static void main(String[] args) {
		//Lambda
		Student student=()->{
			System.out.println("learning method logic...");
			};
			
		student.learn();
	
		Driver driver=(String s)->{
			System.out.println("The driver logic iss....");
			System.out.println("The value supplied is...:"+s);
		};
		
		driver.drive("the light machine..");
		
		Pilot pilot=(name,speed)->{
			System.out.println("The pilot name is...:"+name);
			System.out.println("The speed is...:"+speed);
		};
		
		pilot.fly("kranthi",1000);
	}
}interface Student{
	public void learn();
//	public void doubts();
}interface Driver{
	public void drive(String s);
}interface Pilot{
	public void fly(String name,int speed);

}
