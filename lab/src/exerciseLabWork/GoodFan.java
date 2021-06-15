package exerciseLabWork;
import java.util.Scanner;
public class GoodFan {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	PrintData obj=new PrintData();
	
	while(true) {
		System.out.println("Press a key and enter to pull chain...");
		scan.next();
		obj.pull();
	
	}
}
}
class PrintData{
	Slow sl=new Slow();
	Medium m=new Medium();
	High h=new High();
	int s=0;
	
	public void pull() {
			
		switch(s)
		{
		case 0:
			System.out.println("switch off state...");
			break;
		case 1:
			sl.pull();
			
			break;
		case 2:
			m.pull();
			
			break;
		case 3:
			h.pull();
			
			break;
		default:
			s=0;
			System.out.println("switch off state...");
		}
		s++;
	}
}
class Fan{
	
}
class Slow extends Fan{
	
	public void pull() {
		System.out.println("switch on state....slow");
	}
	
}
class Medium extends Fan{
	public void pull() {
	System.out.println("medium speed state...medium");
	}
}
class High extends Fan{
	public void pull() {
		System.out.println("high speed state.....fast");
	}

}