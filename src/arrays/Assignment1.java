  package arrays;

public class Assignment1 {

	// Print sum of arrays
	// Print greatest number
	// Print smallest number
	public static void main(String[] args) {
		int[] a = { 10, 5, 70, 40 };
		// Print sum
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			c = c + a[i];
		}
		System.out.println("Sum is" + c);

		// Print greatest number

		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("Maximum number is:" + max);

		// Print smallest number
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println("Minium number is:" + min);

		// String[] Str = new String[10]; // declaring String type array of
		// reference variable str and size 5

		String[] Str = { "a", "b", "c", "d", "e", "f", "g", "h", "j", "k", "l","m" };
		System.out.println(Str.length);
		for (int i = 0; i < Str.length;) // not incrementing
		{

			System.out.println("Even indexes:" + Str[i]);
			i = i + 2;
		}
		for (int i = 0; i < Str.length; i++) // incrementing
		{
			i = i + 1;
			System.out.println("Odd indexes:" + Str[i]);

		}
	}
}
