package interviewQuestions.Proxy.Amrit_Experian;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 5, 1, 2, 3, 4, 7, 3, 6};
        int[] arrayonesol = {4, 7, 4, 2};
        System.out.println(Arrays.toString(twoSumExactlyOneSolution(arrayonesol,9)));
       /* System.out.println(Arrays.toString(twoSum(arr, 9)));
        System.out.println(Arrays.toString(removeTailingZeroes(twoSum(arr, 9), arr.length)));*/

    }

    public static int[] removeTailingZeroes(int[] a, int n) {
        n = a.length;
        // index to store the first
        // non-zero number
        int ind = -1;
        // traverse in the array and find the first
        // non-zero number
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] != 0) {
                ind = i;
                i = i + 1;
                System.out.println("zeores are starting from " + i + "th index");
                break;
            }
        }
        // if no non-zero number is there
        if (ind == -1) {
            System.out.print("Array has no tailing zeros only");

        }
        // Create an array to store
        // numbers apart from leading zeros
        int[] b = new int[ind + 1];
        // store the numbers removing leading zeros
        for (int i = 0; i <= ind; i++)
            b[i] = a[i];
        return b;

    }

    public static int[] twoSum(int[] nums, int target) {
        // Array to store result
        //actually can go for list instead of handling array length
        //change index to 0 and 1 for exactly one solution
        int[] result = new int[nums.length];
        // This map will store the difference and the corresponding index
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        // Loop through the entire array
        for (int i = 0; i < nums.length; i++) {
            // If we have seen the current element before
            // It means we have already encountered the other number of the pair
            if (map.containsKey(nums[i])) {
                // Index of the other element of the pair
                result[index] = map.get(nums[i]);
                // Index of the current element
                index++;
                result[index] = i;
                index++;

            }
            // If we have not seen the current before
            // It means we have not yet encountered any number of the pair
            else {
                // Save the difference of the target and the current element
                // with the index of the current element
                map.put(target - nums[i], i);
                // System.out.println(map);
            }
        }
        return result;
    }

    public static int[] twoSumExactlyOneSolution(int[] nums, int target) {
        // Array to store result
        //actually can go for list instead of handling array length
        //change index to 0 and 1 for exactly one solution
        int[] result = new int[2];
        // This map will store the difference and the corresponding index
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        // Loop through the entire array
        for (int i = 0; i < nums.length; i++) {
            // If we have seen the current element before
            // It means we have already encountered the other number of the pair
            if (map.containsKey(nums[i])) {
                // Index of the other element of the pair
                result[0] = map.get(nums[i]);
                // Index of the current element
                result[1] = i;

            }
            // If we have not seen the current before
            // It means we have not yet encountered any number of the pair
            else {
                // Save the difference of the target and the current element
                // with the index of the current element
                map.put(target - nums[i], i);
                // System.out.println(map);
            }
        }
        return result;
    }
}
