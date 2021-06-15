package day12;

public class PBRArrayDemo {

	static int classVariable;
	int instanceVariable;
	static int arr[]=new int[5];
	int array[]=new int[5];
	public static void main(String[] args) {
		System.out.println(classVariable);
		PBRArrayDemo pba=new PBRArrayDemo();
		System.out.println(pba.instanceVariable);
		
		int localVariable=0;
		System.out.println(localVariable);
		
		for(int i:arr) {
			System.out.print(i+"\t");
		}
		System.out.println();
		for(int i:pba.array) {
			System.out.print(i+"\t");
		}
		System.out.println();
		int localArray[]=new int[5]; 
		for(int i:localArray) {
			System.out.print("\tlocal..:"+i);
		}
		
	}
}
