package companies.intrvwQustns.WiproPractice;

import java.util.Arrays;

public class LongestCommonPrefixEasy {
    public static String longestCommonPrefix(String[] a) {
        int size = a.length;
        /* if size is 0, return empty string */
        if (size == 0)
            return "";
        if (size == 1)
            return a[0];
        /* sort the array of strings */
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        /* find the minimum length from first and last string */
        String firstString= a[0];
        String lastString = a[size-1];
        int minimumLength = Math.min(firstString.length(), lastString.length());

        /* find the common prefix between the first and
           last string */
        int i = 0;
        while (i < minimumLength && firstString.charAt(i) == lastString.charAt(i)) {
            i++;
        }
        String pre = firstString.substring(0, i);
        return pre;
    }

    /* Driver Function to test other function */
    public static void main(String[] args) {
        String[] input = {"geeksforgeeks", "geeksf", "geekse", "geekszer"};
        System.out.println("The longest Common Prefix is : " +
                longestCommonPrefix(input));
    }
}
