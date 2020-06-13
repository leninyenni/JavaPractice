package collectionsAndLogical;
import java.util.HashSet;
public class HashSetDemo {
	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add("a");
		h.add("a");
		h.add("aaaa");
		h.add(10);
		h.add(null);
		//h.add(null);
		System.out.println(h);
	}
}
