package javaProgramsMustNeeded;
public class MostRepeatedNum {
	public static void main(String[] args) {
		int arr[] = { 2, 12, 5, 4, 12, 3, 4, 2, 4, 5, 12, 5, 14, 3, 5 };
		int element = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int tempElement = arr[i];
			int tempCount = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == tempElement) {
					tempCount++;
				}
				if (tempCount > count) {
					element = tempElement;
					System.out.println(element);
					count = tempCount;
					System.out.println(count);
				}
			}
		}
		System.out.println("The most frequent element is:" + element + " "
				+ "frequency is:" + count);
	}
}
