package day7;

public class IfElseDemo {

	public static void main(String[] args) {
		int i=18;
		if(i>20) {
			System.out.println("i is less than 20");
		}
		else if(i==10) {
			System.out.println("i is equal to ten....");
		}
		else
		{
			System.out.println("i is greated than 20");
		}
		
		IfElseDemo obj=new IfElseDemo();
		String result=obj.met(i);
		System.out.println("The result is..:"+result);
		
		boolean b=false;
		obj.met3(b);
		
		String str="hello";
		obj.met4(str);
	}
	
	String met(int i) {
		if(i==10 || i<20) {
			return "Condition satisfied...";
		}
		else {
			return "condition is not satisfied";
		}
	}
	String met2(int i) {
		if(i%2==0 && i>20) {
			return "Condition satisfied...";
		}
		else {
			return "condition is not satisfied";
		}
	}
	void met3(boolean valid) {
		if(valid) {
			System.out.println("the value of vaid is true....");
		}
		else {
			System.out.println("the value of valid is false....");
		}
	}
	
	void met4(String s) {
		if(s.equalsIgnoreCase("Hello")) {
			System.out.println("the value of string is hello...");
		}
		else {
			System.out.println("not equal......");
		}
	}
}
