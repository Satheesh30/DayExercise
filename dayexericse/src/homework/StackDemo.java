package homework;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> st=new Stack<>();
		st.push("hi");
		st.add("satheesh");
		st.push("welcome");
		st.push("java program");
		System.out.println("last value take but remove from stack: "+st.pop());
		System.out.println("last value take but remove  not from stack: "+st.peek());
		
		for(String obj:st) {
			System.out.print(" "+obj);
		}
		System.out.println();
		Iterator<String> it=st.iterator();
		while(it.hasNext()) {
			System.out.println("stack value:"+it.next());
		}
	}
}
