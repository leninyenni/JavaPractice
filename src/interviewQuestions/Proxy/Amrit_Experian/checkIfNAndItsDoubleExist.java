package interviewQuestions.Proxy.Amrit_Experian;

import java.util.HashSet;
import java.util.Set;

public class checkIfNAndItsDoubleExist {
    public static boolean checkIfExist(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        for (int i : arr) {
            if (seen.contains(2 * i) || (i % 2 == 0 && seen.contains(i / 2)))
                return true;
            seen.add(i);
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr = {2,7,4,11};
        boolean ans=checkIfExist(arr);
        System.out.println(ans);
    }
}
