package lab;
import java.util.Scanner;
public class AreaOfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Side of Square:");
		 Scanner scan = new Scanner(System.in);
		 double side = scan.nextDouble();
		 double area = side*side; 
		 System.out.println("Area of Square is: "+area);
		 scan.close();
	}
	}