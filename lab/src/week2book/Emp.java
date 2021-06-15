package week2book;

public class Emp {
	int empid;
	String empname;
	Emp(int id,String name){
		this.empid=id;
		this.empname=name;
	}
	void display()
	{
		System.out.println("emp id: "+empid+"\nemp name: "+empname);
	}
	public static void main(String[] args) {
		Emp obj1=new Emp(2331,"satheesh");
		Emp obj2 = new Emp(2332,"kumar");
		obj1.display();
		obj2.display();
		
	}
}
