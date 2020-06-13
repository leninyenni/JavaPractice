package javaProgramsMustNeeded.AdvancedBit;
import java.util.ArrayList;
import java.util.Collections;
public class MaxSubArraySizeK {
	static void max(int[] array, int k) {
		for (int i = 0; i < array.length - k + 1; i++) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			int result = 0;
			for (int j = i; j <= k + i - 1; j++) {
				temp.add(array[j]);
			}
			Collections.sort(temp);
			// System.out.println(temp);
			for (int a : temp) {
				result = a;
				break;
			}
			System.out.println(result);
		}
	}
	public static void main(String args[]) {
		int arr[] = { 10,30,5,19,53};
		max(arr, 2);
	}
}
