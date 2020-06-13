package javaProgramsMustNeeded;
import java.util.ArrayList;
public class DuplicatesInAnArray {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		int[] arr = { 1, 5, 1, 1, 3, 3, 3, 4, 5, 6, 6 };
		for (int i = 0; i < arr.length; i++) {
			if (!al.contains(arr[i])) {
				for (int j = i + 1; j < arr.length; j++) {
					if (!al.contains(arr[j]))
						if (arr[i] == arr[j]) {
							al.add(arr[i]);
							break;
						}
				}
			}
		}
		System.out.println(al);
	}
}
