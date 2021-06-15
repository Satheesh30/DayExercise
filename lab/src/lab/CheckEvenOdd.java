package lab;
import java.util.Scanner;
public class CheckEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss=new Scanner(System.in);
		System.out.print("enter the intger number:");
		int a = ss.nextInt();
		if (a%2==0)
		{
			System.out.println("the given number is even");
			
		}
		else
		{
			System.out.println("the given number is odd");
		}
		ss.close();
	}

}
