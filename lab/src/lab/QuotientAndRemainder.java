package lab;
import java.util.Scanner;
public class QuotientAndRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.print("enter intger vlaue x:");
		int x = scan.nextInt();
		System.out.print("enter intger vlaue y:");
		int y = scan.nextInt();
		scan.close();
		System.out.println("quotient of two number is :"+(x/y));
		System.out.println("remainder of two number is :"+(x%y));
		
	}

}
