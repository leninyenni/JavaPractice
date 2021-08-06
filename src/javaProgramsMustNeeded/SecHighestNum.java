package javaProgramsMustNeeded;

import java.util.Arrays;

public class SecHighestNum {

	public static int secondHighest(int[] array)
	{
		int number=0;
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		for (int i=array.length;i>=1;i--)
		{
			if (array[i-1]!=array[i-2])
			{
				number=array[i-2];
				break;
			}
			else
			{
			}
		}
		return number;
	}

	public static void main(String[] args) {
		int[] arr = { 12, 2, 14, 7, 32, 32, 32, 22, 11 };
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < (arr.length) - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println(arr[(arr.length) - 2]);
		System.out.println(secondHighest(arr));
	}
}
