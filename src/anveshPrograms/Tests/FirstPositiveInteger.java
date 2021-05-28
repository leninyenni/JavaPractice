package anveshPrograms.Tests;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstPositiveInteger {
    public static int firstMissingPositive(ArrayList<Integer> A) {

        // Declaring an unordered_map
        Map<Integer, Integer> mp = new LinkedHashMap<>();
        int n=A.size();

        // if array value is positive
        // store it in map
        for (int i = 0; i < n; i++)
        {
            if (A.get(i) > 0)
            {
                mp.put(A.get(i), mp.get(A.get(i)) == null ? 1 : mp.get(A.get(i)) + 1);
            }
        }

        // index value set to 1
        int index = 1;

        // Return the first value starting
        // from 1 which does not exists in map
        while (true)
        {
            if (!mp.containsKey(index))
            {
                return index;
            }

            index++;
        }
    }

    public static void main(String []a){

        ArrayList<Integer> intList=new ArrayList<>();
        intList.add(3);
        intList.add(2);
        intList.add(-1);
        intList.add(4);
        intList.add(5);
        intList.add(6);
        System.out.println(firstMissingPositive(intList));
    }
}
