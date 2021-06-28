package day20;

public class Inheritance {

	public static void main(String[] args) {
		Parent p=new Child();
		System.out.println(p.x);
		p.met();
		p.goldMethod();
		
		p=new Child2();
		p.goldMethod();
	}
}abstract class Parent{// by declaring the class abstract you get the advantage of having abstract methods...
	public Parent(int i) {// constructors are not overriden...there is no concept of overriding in constructor...
		System.out.println("parent cons called...");
	}
	public Parent(int i,String s) {
		System.out.println("overloaded constructor called...");
	}
	int x=10;
	public void goldMethod() {
		System.out.println("reusable method....");
	}
	final public void met() {// final methods cannot be overriden...
		System.out.println("parent met called....");
	}
}
class Child extends Parent{
	public Child() {
		super(2);//this will call the parent constructor - super should be first line inside the child constructor
		System.out.println("child cons called...");
	}
	int x=20;//no overriding
//	public void met() {//methods override the parent method
	//	System.out.println("child met called...");
	//}
}
class Child2 extends Parent{
	public Child2() {
		super(33,"aaa");
	}
}
//1. The child is a kind of parent
//2. The child can replace the parent - Parent p=new Child();
//3. Properties of parent will available in child - code reusability
//4. There is no concept of overriding in variables.
//5. Methods are overriden
//6. Code reusability is achived...

