package companies.intrvwQustns.Oracle;

import java.util.Arrays;

public class RotateArrayKTimes {

    public static int[] rotateKtimes(int[] array, int K) {
        int[] result = new int[array.length];
        if (K > array.length) {
            K = K % array.length;
            System.out.println(K);
        }
        for (int i = 0; i < array.length; i++) {
            if (i + K < array.length) {
                result[i] = array[i + K];
            } else {
                result[i] = array[i + K - array.length];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(rotateKtimes(input, 10)));

    }
}
