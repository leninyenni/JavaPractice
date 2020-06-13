package telegramSource.InterviewPrograms;
public class GiveFrequentElementsJaggu {
	public static void main(String[] args) {
		int arr[] = {2,2,3,3};
		int temp[] = new int[arr.length];
		int element = 0;
		int count = 0;
		
		int max=0;
		for (int i = 0; i < arr.length; i++) {
			int tempElement = arr[i];
			int tempCount = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == tempElement) {
					tempCount++;
					max++;
				}
				if (tempCount >= count) {
					element = tempElement;
					count = tempCount;
				}
			}
			if (!didItContains(temp, element) && tempCount >= count) {
				temp[i] = element;
				if(max>count)
				System.out.println("The most frequent element is:" + element
						+ " " + "frequency is:" + count);

			}
		}
	}
	private static boolean didItContains(int[] arr, int targetValue) {
		for (int value : arr) {
			if (value == targetValue)
				return true;
		}
		return false;
	}
}
