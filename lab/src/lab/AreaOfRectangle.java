package lab;
import java.util.Scanner;
public class AreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of Rectangle:");
		 double length = scan.nextDouble();
		 System.out.println("Enter the width of Rectangle:");
		 double width = scan.nextDouble();
		 double area = length*width;
		 System.out.println("Area of Rectangle is:"+area);
		 scan.close();
	}
	}
	