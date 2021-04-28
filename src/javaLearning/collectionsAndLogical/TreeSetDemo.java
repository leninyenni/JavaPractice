package javaLearning.collectionsAndLogical;
import java.util.SortedSet;
import java.util.TreeSet;
public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add(50);
		t.add(20);
		t.add(40);
		t.add(10);
		t.add(30);
		System.out.println(t);
		SortedSet s1 = t.headSet(50); //headSet() method is used as a limit setter for a tree set, to return the elements up to a limit defined in the parameter of the method in a sorted manner excluding the element.
		System.out.println(s1);// [10,20,30,40]
		SortedSet s2 = t.tailSet(30);
		System.out.println(s2);// [30,40,50]
		SortedSet s3 = t.subSet(20, 50);
		System.out.println(s3);// [20,30,40]
	}
}
