package collectionsAndLogical;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
public class HashMapDemo {
	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put("Nag", 1000);
		m.put("chiru", 200);
		m.put("arjun", 1200);
		m.put("venky", 100);
		// System.out.println(m);
		int a= (Integer) m.get("venky");
		System.out.println(a);
		m.remove("Nag");
		System.out.println(m); // to remove entry from entry object where Object
								// Key matches "Nag"
		Set s = m.entrySet();
		System.out.println(s);
		Iterator itr = s.iterator();
		while (itr.hasNext()) // one way of printing key value pair
		{
			Entry en = (Entry) itr.next();
			System.out.println(en.getKey() + "-" + en.getValue());
		}
		if (m.containsKey("Chiru")) {
			Set s1 = m.keySet();
			Iterator i = s1.iterator();
			while (i.hasNext()) {
				String ab = (String) i.next();
				System.out.println(ab + "-" + m.get(ab));
			}
		}
	}
}