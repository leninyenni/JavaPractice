package javaLearning.arrays;

import java.util.Arrays;

public class EpamQuestion {


    public int smallestInteger(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] intArray = {52, 45, 32, 64, 12, 87, 78, 98, 23, 7};
        System.out.println(Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
        System.out.println(intArray[0]);
        System.out.println(intArray[intArray.length - 1]);
    }
}
