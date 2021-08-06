package anveshPrograms;

import java.util.Arrays;

public class RecursiveBubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{1000, 0, 1, 5, 2, 99, -1, -2, 0, -563};
        new RecursiveBubbleSort().bubbleSortedArray(array, array.length);
        System.out.println(Arrays.toString(array));
    }

    private void bubbleSortedArray(int[] arrays, int n) {
        if (n == 1)
            return;
        for (int i = 0; i < n - 1; i++) {
            if (arrays[i + 1] < arrays[i]) {
                int temp = arrays[i];
                arrays[i] = arrays[i + 1];
                arrays[i + 1] = temp;
            }
        }
        bubbleSortedArray(arrays, n - 1);
    }
}
