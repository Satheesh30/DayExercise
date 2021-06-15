package lab;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first =100,second=300;
		System.out.println("--before swap--");
		System.out.println("first value:"+first);
		System.out.println("second value:"+second);
		first=first-second;
		second=first+second;
		first=first-second;
		System.out.println("--after swap--");
		System.out.println("first value:"+first);
		System.out.println("second value:"+second);
	}

}
