package collectionsAndLogical;
import java.util.LinkedList;
public class LinkedListWork {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		System.out.println(ll.size());
		// add the elements to the LinkedList
		ll.add("a");
		System.out.println(ll);
		ll.add(10);
		System.out.println(ll);
		ll.add(10.6);
		System.out.println(ll);
		ll.addFirst("ratan");
		System.out.println(ll);
		ll.addLast("anu");
		System.out.println("original content :" + ll);
		System.out.println(ll.size());
		// remove elements from LinkedList
		ll.remove(10.6);
		System.out.println(ll);
		ll.remove(0);
		System.out.println("after deletion content :" + ll);
		System.out.println(ll.size());
		// remove first and last elements
		ll.removeFirst();
		System.out.println(ll);
		ll.removeLast();
		System.out.println("ll after deletion of first and last :" + ll);
		// get and set a value
		int a = (Integer) ll.get(0);
		ll.set(0, a + "ratan");
		System.out.println("ll after change:" + ll);
	}
}
