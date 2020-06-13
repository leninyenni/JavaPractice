package collectionsHarikrishna;
import java.util.TreeSet;
public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<CharSequence> t = new TreeSet();
		
		  t.add("a"); t.add("A"); t.add("B"); t.add("Z"); t.add("L"); 
		 
		/*t.add(new StringBuffer("a"));
		t.add(new StringBuffer("b"));
		t.add(new StringBuffer("c"));*/
		/*t.add("A");
		t.add("B");*/
		System.out.println(t);
	}
}
