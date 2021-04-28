package companies.intrvwQustns.medtronicExam;
public class ArrayConverterUsingTwoArrays {
	static int[] convertarr(int[] a, int num) {
		int[] res = new int[5];
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 4) {
					res[j] = a[0];
					break;
				} else {
					res[j] = a[j + 1];
				}
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 4 };
		int cou = 3;
		int[] fin = new int[5];
		for (int i = 0; i < cou; i++) {
			if (i == 0) {
				fin = convertarr(arr, i);
			} else {
				fin = convertarr(fin, i);
			}
		}
		for (int a : fin) {
			System.out.println(a);
		}
	}
}
