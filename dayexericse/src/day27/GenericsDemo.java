package day27;

public class GenericsDemo {
	public static void main(String[] args) {
		Paint paint=new RedPaint();
		Powder powder=new RosePowder();
		
		GoodPaintBrush b=new GoodPaintBrush();
		b.obj=powder;
		b.execute();
		b.obj=paint;
		b.execute();
	}

}
abstract class Paint{
	public abstract void color();
}
class RedPaint extends Paint{
	@Override
	
	public void color() {
		System.out.println("red...");
		
	}
}
class BluePaint extends Paint{
	@Override
	public void color() {
		System.out.println("blue...");
	}
}
abstract class Powder{
	public abstract void doMarkup();
	
}
class RosePowder extends Powder{
	@Override
	public void doMarkup() {
		System.out.println("rose powder..");
	}
}
class WhitePower extends Powder{
	@Override
	public void doMarkup() {
		System.out.println("white powder..");
	}
}
class GoodPaintBrush{
	Object obj;
	public void execute() {
		if(obj instanceof Paint) {
			Paint paint= (Paint)obj;
			paint.color();
			
		}
		if(obj instanceof Powder) {
			Powder makeup=(Powder)obj;
			makeup.doMarkup();
			
		}
	}
}