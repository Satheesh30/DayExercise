package homework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;



public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> qu=new LinkedList<String>();
		qu.add("wecome java queue");
		qu.add("satheesh");
		qu.add("playing football");
		System.out.println(qu.peek());
		//System.out.println(qu.peek());
		
		Iterator it=qu.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//qu.remove();
		qu.remove("satheesh");
		System.out.println("remove queue value: "+qu);
	}
}
