package week2_lab_exericse;
import java.io.*;
public class MyclassQno15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyclassQno15 m=new MyclassQno15();
		System.out.println(m.met());
	}
public int met()
{
	try {
		FileInputStream dis=new FileInputStream("Hello.txt"); 
	 }
	catch (FileNotFoundException fne) { 
	 System.out.println("No such file found"); 
	 return -1; 
	 }
	catch(IOException ioe)
	{ 
	 } 
	finally{ 
	 System.out.println("Doing finally"); 
	 } 
	 return 0; 
	 }
}
