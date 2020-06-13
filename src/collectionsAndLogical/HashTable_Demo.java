package collectionsAndLogical;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;

/*1. It is a legacy class introduced in the 1.0 version.
2. Every method is synchronized hence only one thread is allow to access.
3. The performance of the application is low.
4. Null insertion is not possible if we are trying to insert null values we are getting NullPointerException.
*/
public class HashTable_Demo {
	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		h.put("hyd", 100);
		h.put("bang", 200);
		h.put("pune", 300);
		h.put("pune", 400);
		System.out.println(h);
		System.out.println(h.contains(300));// true Hashtable contains() Method in Java is used to check whether a particular value is being mapped by any keys present in the Hashtable. Parameters: The method accepts one parameter value of object type and refers to the value of the hashtable whose mapping is to be verified.
		System.out.println(h.containsValue(500));// false
		Collection c = h.values();
		System.out.println(c);
		Set c1 = h.keySet();
		System.out.println(c1);
	}
}
