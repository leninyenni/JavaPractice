package javaLearning.collectionsAndLogical;
import java.util.ListIterator;
import java.util.Vector;

/*1. It is applicable for only list type of objects.
2. By using this it is possible to read the data upate the data and delete data also.
3. By using listIterator() method we are getting LIstIterator object*/
public class ListIteratorConcept {
	public static void main(String[] args) {
		Vector v = new Vector();
		for (int i = 0; i < 10; i++) {
			v.addElement(i);
		}
		System.out.println(v);
		ListIterator litr = v.listIterator();
		while (litr.hasNext()) {
			Integer i = (Integer) litr.next();
			if (i == 0) {
				litr.add("veeru");
				System.out.println(v);
			}
			if (i == 5) {
				litr.set("sambha");
				System.out.println(v);
			}
			if (i == 9) {
				litr.remove();
				System.out.println(v);
			}
		}
		System.out.println(v);
	}
}
