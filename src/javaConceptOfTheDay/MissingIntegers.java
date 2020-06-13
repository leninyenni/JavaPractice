package javaConceptOfTheDay;
public class MissingIntegers {
	public static void main(String[] args) {
		int[] array = { 10,50,100 };
		System.out.print("(");
		for (int i = 0; i < array.length; i++) {
			if (i != array.length - 1) {
				int temp = array[i + 1] - array[i];
				if (temp != 0) {
					int a = array[i] + 1;
					while (a < array[i + 1]) {
						System.out.print(a);
						a++;
						if (a != array[array.length - 1]) // nice thought
							System.out.print(",");
					}
				}
			} else {
				System.out.println(")");
				System.out.println("above are the numbers");
			}
		}
	}
}
