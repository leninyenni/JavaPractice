package collectionsAndLogical;
import java.util.LinkedHashSet;
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet h = new LinkedHashSet();
		h.add("a");
		h.add("a");
		h.add("aaaa");
		h.add(10);
		h.add(null);
		System.out.println(h);
	}
}
