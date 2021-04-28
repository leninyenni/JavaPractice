package javaLearning.collectionsAndLogical;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*1. It used to hold key value pairs
2. Underlying data Structure is HashTable & LinkedList.
3. Duplicate keys are not allowed but values can be duplicated.
4. Insertion order is preserved.*/
public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap h = new LinkedHashMap();
		h.put("sambha", 100);
		h.put("veeru", 100);
		h.put("durga", 100);
		System.out.println(h);
		Set s = h.keySet();
		System.out.println(s);
		Collection c = h.values();
		System.out.println(c);
		Set s1 = h.entrySet();
		System.out.println(s1);
		Iterator itr = s1.iterator();
		while (itr.hasNext()) {
			Map.Entry m1 = (Map.Entry) itr.next();
			System.out.println(m1.getKey() + "------" + m1.getValue());
			if (m1.getKey().equals("sambha")) {
				m1.setValue("gayan TeamLead");
			}
		}
		System.out.println(s1);
	}
}
