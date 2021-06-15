package lab;
import java.util.Scanner;
public class Findlcm {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the two number:");
		int x = s.nextInt();
		int y = s.nextInt();
		s.close();
		int lcm;
		 lcm = (x > y) ? x : y;
		 while(true)
		 {
		 if( lcm % x == 0 && lcm % y == 0 )
		 {
		 System.out.printf("The LCM of %d and %d is %d.", x, y, lcm);
		 break;
		 }
		 ++lcm;
	}
	}
}