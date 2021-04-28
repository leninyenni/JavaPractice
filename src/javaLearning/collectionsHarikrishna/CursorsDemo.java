package javaLearning.collectionsHarikrishna;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;
public class CursorsDemo {
	public static void main(String[] args) {
		Vector v = new Vector();
		Enumeration e = v.elements();
		Iterator i = v.iterator();
		ListIterator li = v.listIterator();
		System.out.println(e.getClass().getName());
		System.out.println(i.getClass().getName());
		System.out.println(li.getClass().getName());
	}
}
