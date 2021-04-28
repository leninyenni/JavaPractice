package javaLearning.arrays.javaConceptOfTheDay;
public class SecondLargestInArray {
	public static void secondLargest(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			int count = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[j] >= array[i]) {
					count++;
				}
			}
			if (count==2)
			{
				System.out.println(array[i]);
			}
		}
	}
	public static void main(String[] args) {
		int[] random = {47498, 14526, 74562, 42681, 75283, 45796};
		SecondLargestInArray.secondLargest(random);
	}
}
