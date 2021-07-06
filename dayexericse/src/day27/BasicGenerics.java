package day27;

public class BasicGenerics {
	public static void main(String[] args) {
		Ball obj=new Ball();
		Sky sky=new Sky();
		
		RigthAccept<Ball> r=new RigthAccept<>();
		r.setT(obj);
		RigthAccept<Sky> r1=new RigthAccept<>();
		r1.setT(sky);
		Ball ball=r.getT();
		Sky sk=r1.getT();
		
	}
}
class Ball{
	
}
class Sky{
	
}
class RigthAccept<T>{
	T obj;
	public T getT() {
		return obj;
	}
	public void setT(T obj) {
		this.obj=obj;
	}
}