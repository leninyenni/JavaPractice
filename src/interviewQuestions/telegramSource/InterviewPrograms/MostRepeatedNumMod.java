package interviewQuestions.telegramSource.InterviewPrograms;

import java.util.Arrays;

public class MostRepeatedNumMod {
	static void sortArray(int[] arr) {
		int temp;
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {10,10,20,20};
		int element = 0;
		int count = 0;
		int repeat = 0;
		// Arrays.sort(arr);
		sortArray(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
		for (int i = 0; i < arr.length; i++) {
			int tempElement = arr[i];
			int tempCount = 0;
			if (tempElement != repeat) {
				for (int j = 0; j < arr.length; j++) {
					if (arr[j] == tempElement) {
						tempCount++;
					}
				}
				if (tempCount > count) {
					element = tempElement;
					count = tempCount;
				} else if (tempCount == count) {
					System.out.println("Duplicate element in array with "
							+ tempCount + " times is:" + tempElement);
				}
				repeat = tempElement; 
			}
		}
		System.out.println("The most frequency of array is : " + count
				+ " and the current element is : " + element);
	}
}
