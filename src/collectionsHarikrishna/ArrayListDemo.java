package collectionsHarikrishna;
import java.util.ArrayList;
public class ArrayListDemo {
	public static void main(String[] args) {
		// creating an ArrayList
		ArrayList<Comparable> al = new ArrayList();
		System.out.println(al.size());
		// add elements
		al.add("red");
		al.add(1);
		al.add("blue");
		al.add("pink");
		al.add("orange");
		System.out.println(al.size());
		System.out.println(al);
		// remove 4th index from ArrayList
	/*	al.remove(4);
		System.out.println(al);*/
		// remove specific element from ArrayList
		/*al.remove("pink");// if object not in the list was removed, no error
							// being thrown
		System.out.println(al);*/
		//retrieving 1st index element
		System.out.println(al.get(1));
		//inserting at 2nd index
		al.add(2, "rose"); // here it adds at specified index and array size will be increased
		System.out.println(al);
		
	}
}
