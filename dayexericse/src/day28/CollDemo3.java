package day28;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class CollDemo3 {

	public static void main(String[] args) {
		
		Vector<String> list=new Vector<>(10,5);
		list.add("siva");
		list.add("josh");
		list.add("leffin");
		list.add("haii");
		System.out.println("after vector is used..:"+list);
		
		ListIterator<String> li=list.listIterator();
		while(li.hasNext()) {
			System.out.println("listIterator"+li.next());
		}
		Enumeration<String> en= list.elements();
		list.add("welocme");
		list.add(5, "java");
		while(en.hasMoreElements()) {
			System.out.println("enumer:"+en.nextElement());
		}
	}
}
