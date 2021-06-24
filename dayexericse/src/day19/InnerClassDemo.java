package day19;

public class InnerClassDemo {

	public static void main(String[] args) {
		Kali kalimark=new Kali();
		kalimark.sellCola();
		
		Pepsi pepsico=new Pepsi();
		pepsico.sellCola();
	}
}
interface Cola{
	public void makeCola();
}class Pepsi{
	public void sellCola() {
		//if you want to access a inner class  -- below is the syntax
		//Kali.CampaCola cc=new Kali().new CampaCola();
		
		//Cola cc=new Kali().thief();
	//	cc.makeCola();
	//	System.out.println("Pepsi fills campa cola in pepsi bottle and sell..");
	}
}
class Kali{
	public void sellCola() {
		//local inner class - a class with in a method...
		class CampaCola implements Cola{//inner class
			@Override
			public void makeCola() {
				System.out.println("Cola made by campa cola...");
			}
		}
		CampaCola cc=new CampaCola();
		cc.makeCola();
		System.out.println("kali fills campa cola in bovonto bottle and sell..");
	}
//	public Cola thief() {
//		return new CampaCola();
//	}
	//kalimark has acquired campacola...
//	private class CampaCola implements Cola{//inner class
//		@Override
//		public void makeCola() {
//			System.out.println("Cola made by campa cola...");
//		}
//	}
}

