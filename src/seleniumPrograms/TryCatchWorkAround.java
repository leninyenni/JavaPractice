package seleniumPrograms;
public class TryCatchWorkAround {
	public static void main(String args[]) {
		int b = 5;
		while (2 > 1) {
			b = ++b;
			try {
				if (b == 7) {
					break;
				}
			} catch (Exception e) {
				System.out.println(b);
			}
			System.out.println("hello");
		}
	}
}
