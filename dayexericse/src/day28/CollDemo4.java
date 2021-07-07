package day28;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class CollDemo4 {

	public static void main(String[] args) {
		Set<String> set1=new HashSet<String>();
		Set<String> set=new TreeSet<String>();
		set.add("hello");
		set.add("hai");
		set.add("hello");
		set.add("world");
		set.add("earth");
		set1.add("welcome");
		set1.add("java");
		
		System.out.println(set);
		set.add("zebra");
		set.add("almighty");
		
		System.out.println("hashset..:"+set1);
		System.out.println("treeset..:"+set);
		
		
		Iterator<String> iter=set1.iterator();
		//set1.add("siva");
		while(iter.hasNext()) {
			System.out.println("iterator hashset:"+iter.next());
		}
		
		for(String s:set) {
			System.out.println("for loop in treeset:"+s);
		}
		
}}
