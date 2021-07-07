package day28;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;
import java.util.ListIterator;

public class CollDemo {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("subramain");
		list.add("siva");
		list.add("hai");
		System.out.println(list.get(1));
		System.out.println(list.contains("hai"));
		System.out.println(list.isEmpty());
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.remove(2));
		System.out.println(list.set(3, "josh"));
		
		for(String obj:list) {
			System.out.println("for inside...:"+obj);
		}
		ListIterator<String> li=list.listIterator();
		while(li.hasNext()) {
			System.out.println("listiterator:"+li.next());
	}
	
}}
