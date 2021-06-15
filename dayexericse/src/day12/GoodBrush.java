package day12;

public class GoodBrush {

	public static void main(String[] args) {
		GoodPaintBrush brush=new GoodPaintBrush();
		RedPaint rp=new RedPaint();
		BluePaint bp=new BluePaint();
		GreenPaint gp=new GreenPaint();
		
		brush.rp=gp;
		brush.doPaint();
	}
}class GoodPaintBrush{
	Paint rp;
	public void doPaint() {
		System.out.println(rp);
	}

	}
class Paint{
	
}
class RedPaint extends Paint{
	
}
class BluePaint extends Paint{
	
}
class GreenPaint extends Paint{
	
}

