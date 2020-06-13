package collectionsAndLogical;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> l=new ArrayList<String>(); //generics concept introduced in 1.5version
		
		l.add("Lenin");
		l.add("10");
		l.add(null);
		l.add(1, "Kumar");
		System.out.println(l);
		System.out.println(l.get(2));
		
		//default l.toString() gets executed. [Lenin,10,null]
		/*l.remove(1); //  removes value in 1 index 
		System.out.println(l); //[Lenin,null]
		l.add(1, "20"); //adds 20 in 1 index 
		l.add("Kumar"); //adds Kumar at the end
		System.out.println(l);// [Lenin,20,null,Kumar]
*/		
	}

}
