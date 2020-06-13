package dbs;
// A simple Java program to 
//count pairs with difference k
class countpairsofnumbers {
	static int count = 0;
	static void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swap temp and arr[i]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}
	/* Prints the array */
	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	static void countpair(int[] array) {
		for (int i = 0; i < array.length - 1;) {
			if (array[i] == array[i + 1]) {
				count++;
			}
			i = i + 2;
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		int arr[] = { 4, 1, 2, 1, 2, 3, 3, 2, 2, 4, 4, 4 };
		bubbleSort(arr);
		countpair(arr);
	}
}
