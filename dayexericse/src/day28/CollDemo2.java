package day28;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CollDemo2 {

	public static void main(String[] args) {
		List<String> list=new LinkedList<String>();
		list.add("subramain");
		list.add("welcome");
		list.add("collection");
		System.out.println(list.get(1));
		System.out.println(list.contains("haii"));
		System.out.println(list.isEmpty());
		Collections.sort(list);
		System.out.println(list);
		//System.out.println(list.remove(2));
		System.out.println(list.set(2, "josh"));
		
		for(String obj:list) {
			System.out.println("for inside...:"+obj);
		}
		ListIterator<String> li=list.listIterator();
		while(li.hasNext()) {
			System.out.println("listiterator:"+li.next());
		}
	
	}
}
