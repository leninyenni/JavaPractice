package javaLearning.collectionsHarikrishna;
import java.util.LinkedList;
import java.util.ListIterator;
public class ListIteratorDemo {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add("balayya");
		ll.add("venky");
		ll.add("chiru");
		ll.add("nag");
		System.out.println(ll);
		// Using listiterator i want to replace,remove and add
		ListIterator ltr = ll.listIterator();
		while (ltr.hasNext()) {
			String str = (String) ltr.next();
			if (str.equals("venky")) {
				ltr.remove();
			} else if (str.equals("chiru")) {
				ltr.add("charan");
			} else if (str.equals("nag")) {
				ltr.set("chaitu");
			}
		}
		System.out.println(ll);
	}
}
