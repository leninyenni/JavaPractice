package collectionsAndLogical;
import java.util.ArrayList;
public class ArrayListWithGenerics {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		Integer[] a = new Integer[al.size()]; //creating integer array
		al.toArray(a); //converting arraylist object to an array
		int sum = 0;
		for (Integer a1 : a) {
			sum = sum + a1;
			System.out.println(a1);
		}
		System.out.println(sum);
		System.out.println(al);
	}
}
