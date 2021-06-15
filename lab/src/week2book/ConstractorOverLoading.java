package week2book;


class Cs{
	int p,q;
	public Cs()
	{
		
	}
	public   Cs(int i,int j)
	{
		p=i;
		q=j;
	
	}
	public int add(int x,int y)
	{
		return (x+y);
	}
	public int add(int x,int y,int z)
	{
		return (x+y+z);
		
	}
	public float add (float f1,float f2)
	{
		return(f1+f2);
	}
	public void printdata() {
		System.out.println("p= "+p);
		System.out.println("q= "+q);
	}
	
}

public class ConstractorOverLoading 
{
	public static void main(String[] args)
	{
		int x =2,y=3,z=7;
		Cs c=new Cs();
		Cs c1=new Cs(x,z);
		c1.printdata();
		float f1=23.1f,f2=32.3f;
		int k = c.add(x, y);
		int f = c.add(x, y,z);
		float a= c.add(f1, f2);
		System.out.println("k= "+k);
		System.out.println("f= "+f);
		System.out.println("a= "+a);
	}

}
