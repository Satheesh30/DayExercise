package week2book;


 public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stest s1 =new Stest();
		Stest s2=new Stest();
		s1.name="satheesh";
		s1.age=23;
		s1.city="triunelvil";
		s2.name="kumar";
		s2.age=23;
		s2.city="chennia";
		s1.printdata();
		s2.printdata();
		
		s1.m=20; 
		s2.m=22; 
		 Stest.m=27; 
		 System.out.println("s1.m = "+s1.m); 
		 System.out.println("s2.m = "+s2.m); 
		 System.out.println("Student.m ="+Stest.m); 
	}	

}
 class Stest
{
	String name,city;
	int age;
	static int m;
	void printdata() {
		System.out.println("Student of name : "+name);
		System.out.println("Student of age : "+age);
		System.out.println("Student of city : "+city);
		}
}
