package javaLabPrograms.practiceagain;
import java.util.Arrays;

//need changes
public class RemoveDuplicateElementsInArrayExampleMylogic {
	static int[] removeduplicates(int[] arr, int size) {
		if (size >= 1) {
			int[] temp = new int[size];
			int j = 0;
			int count = 0;
			for (int i = 0; i < size - 1; i++) {
				if (arr[i] == arr[i + 1]) {
					count++;
					if (count == 1) {
						temp[j] = arr[i + 1];
						j++;
					}
				} else {
					count = 0;
				}
			}
			return temp;
		}
		return arr;
	}
	public static void main(String[] args) {
		int arr[] = { 20, 60, 10, 20, 10 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int result[] = removeduplicates(arr, arr.length);
		System.out.println(Arrays.toString(result));
	}
}
