package javaProgramsMustNeeded;
public class PrintStarPyramidDup {
	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			for (int k = 0; k < 5 - i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				if (j % 2 == 0) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println(" ");
		}
	}
}
