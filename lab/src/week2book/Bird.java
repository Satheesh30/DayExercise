package week2book;

public class Bird {
int age;
String name;
Bird(){
	System.out.println("the bird is parrot");
}
Bird (String m){
	name=m;
	System.out.println("the bird name is : "+name);
}
Bird(int x,String y){
	age=x;
	name=y;
	System.out.println("the bird name is: "+name+"\nthe age of bird is : "+age);
}
public static void main(String[] args) {
	Bird b=new Bird();
	Bird b1=new Bird("maina");
	Bird b2 = new Bird(33,"sparrow");
	
}
}
