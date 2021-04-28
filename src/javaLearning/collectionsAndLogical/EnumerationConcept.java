package javaLearning.collectionsAndLogical;
import java.util.Enumeration;
import java.util.Vector;
public class EnumerationConcept {
	public static void main(String[] args) {
		Vector v = new Vector();
		for (int i = 0; i < 10; i++) {
			v.addElement(i);
		}
		System.out.println(v);
		Enumeration e = v.elements(); //elements() method of Vector class in Java is used to get the enumeration of the values present in the Vector. Parameters: The method does not take any parameters. Return value: The method returns an enumeration of the values of the Vector.
		while (e.hasMoreElements()) {
			Integer i = (Integer) e.nextElement();
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println(v);
	}
}
