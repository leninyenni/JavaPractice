package javaConceptOfTheDay;
public class ArrayEquality {
	public static void main(String[] args) {
		int[] A = {21, 57, 11, 37, 24};
		int[] B = {21, 57, 11, 37, 24};
		int count = 0;
		if (A.length != B.length) {
			System.out.println("unequal arrays");
		} else {
			for (int i = 0; i < A.length; i++) {
				for (int j = 0; j < B.length; j++) {
					if (A[i] == B[j]) {
						count++;
					}
				}
				// System.out.println(count);
			}
			if (count == A.length) {
				System.out.println("equal arrays");
			} else {
				System.out.println("unequal arrays");
			}
		}
	}
}
