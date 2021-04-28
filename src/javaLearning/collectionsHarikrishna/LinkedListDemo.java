package javaLearning.collectionsHarikrishna;
import java.util.LinkedList;
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("durga");
		l.add(30);
		l.add(null);
		l.add("durga");
		System.out.println(l);
		l.add(0, "venky");
		System.out.println(l);
		l.addLast("cccc");
		System.out.println(l);
		l.addFirst("BBB");
		System.out.println(l);
	}
}
