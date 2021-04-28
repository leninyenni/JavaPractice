package javaLearning.collectionsAndLogical;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class HashMapDemoRatan {
	public static void main(String[] args) {
		HashMap h = new HashMap();
		h.put("sambha", 100);
		h.put("veeru", 100);
		h.put("durga", 100);
		System.out.println(h);
		Set s = h.keySet();
		System.out.println("Key set is:" + s);
		Collection c = h.values();
		System.out.println("values are:" + c);
		Set s1 = h.entrySet(); //It basically returns a set view of the map or we can create a new set and store the map elements into them
		System.out.println("Entry set is:" + s1);
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
