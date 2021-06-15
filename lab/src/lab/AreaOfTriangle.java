package lab;
import java.util.Scanner;
public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the width of the Triangle:");
		 double base = scan.nextDouble();
		 System.out.println("Enter the height of the Triangle:");
		 double height = scan.nextDouble();
		 double area = (base* height)/2;
		 System.out.println("Area of Triangle is: " + area);
		 scan.close();
	}
}