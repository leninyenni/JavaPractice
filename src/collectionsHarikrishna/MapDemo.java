package collectionsHarikrishna;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class MapDemo {
	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put("nagarjuna", 700);
		m.put("balaiah", 800);
		m.put("venky", 200);
		m.put("chiru", 500);
		System.out.println(m); // insertion order depends on hascode of Key
								// objects
		System.out.println(m.put("chiru", 1500));// returns old value
		System.out.println(m);
		// KeySet() method returns all the keys in set form
		Set s = m.keySet();
		System.out.println(s);
		// values() method returns all the values in form of a collection
		Collection c = m.values();
		System.out.println(c);
		// entrySet() method returns all the entries of map in a set form
		Set s1 = m.entrySet();
		System.out.println(s1);
		// we can retrieve each entry using iterator and we can use entry
		// methods on it
		Iterator itr = s1.iterator();
		while (itr.hasNext()) {
			Map.Entry m1 = (Map.Entry) itr.next();
			if (m1.getKey().equals("nagarjuna")) {
				m1.setValue(2000);
			}
			System.out.println(m1.getKey() + "--" + m1.getValue());
		}
		System.out.println(m);
	}
}
