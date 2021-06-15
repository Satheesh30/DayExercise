package week2book;
import java.util.Scanner;
public class Ladder {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.print("enter the row: ");
	int n =s.nextInt();
	for (int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++) 
			System.out.print(j);
				for(int k=i-1;k>=1;k--) 
					System.out.print(k);
					System.out.print("\n");
			}
		}
	}
		
