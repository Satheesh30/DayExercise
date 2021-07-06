package day27;

public class BasicGenerics {
	public static void main(String[] args) {
		Ball obj=new Ball();
		Sky sky=new Sky();
		
		RigthAccept<Ball> r=new RigthAccept<>();
		r.setT(obj);
		RigthAccept<Sky> r1=new RigthAccept<>();
		r1.setT(sky);
		Ball ball=r.getA();
		Sky sk=r1.getA();
		
	}
}
class Ball{
	
}
class Sky{
	
}
class RigthAccept<A>{
	A obj;
	public A getA() {
		return obj;
	}
	public void setT(A obj) {
		this.obj=obj;
	}
}