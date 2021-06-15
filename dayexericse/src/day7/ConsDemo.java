package day7;

public class ConsDemo {

	public ConsDemo()
	{
		System.out.println("welcome to java ");
	}
	
	public ConsDemo(int i)
	{
		if (i%2==0) 
		{
		System.out.println("the given number is even "+i);
		}
		else 
		{
			System.out.println("the given number is odd "+i);
		}
	}
	
	public ConsDemo(String s)
	{
		
		System.out.println(s+"  happy to learn this language");
	}
	
	public ConsDemo(int s,String str)
	{
		System.out.println("i has compelt ug " + str + " in year pass out in " +s);
	}
	public static void main(String[] args)
	{
		//new ConsDemo();
		//new ConsDemo(2017,"BCA");
		new ConsDemo(23);
	
	}
	}
	