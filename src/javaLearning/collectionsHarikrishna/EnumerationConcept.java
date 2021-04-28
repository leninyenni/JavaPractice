package javaLearning.collectionsHarikrishna;
import java.util.Enumeration;
import java.util.Vector;
public class EnumerationConcept {
	public static void main(String[] args) {
		Vector v = new Vector();
		for (int i = 0; i <= 10; i++) {
			v.addElement(i);
		}
		System.out.println(v);
		// i want to print only even numbers
		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			int val = (Integer) e.nextElement();
			Integer val1 = (Integer) e.nextElement();
			if (val % 2 == 0) {
				System.out.println(val);
			}
		}
		// any value we are not changing any collection here
		System.out.println(v);
	}
}
