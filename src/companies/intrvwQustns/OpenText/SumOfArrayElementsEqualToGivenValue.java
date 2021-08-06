package companies.intrvwQustns.OpenText;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SumOfArrayElementsEqualToGivenValue {
    public static void main(String[] args) {
        int s[] = {1,15,9,10,20,5};
        int sum = 30;
        ArrayList<ArrayList<Integer>> lis = subsets(s, sum);
        Iterator<ArrayList<Integer>> t1 = lis.iterator();
        while (t1.hasNext()) {
            List<Integer> t2 = t1.next();
            int count = 0;
            Iterator<Integer> t3 = t2.iterator();
            while (t3.hasNext()) {
                count = count + t3.next();
            }
            if (count == sum)
                System.out.println(t2);
        }

    }

    public static ArrayList<ArrayList<Integer>> subsets(int[] S, int sum) {
        if (S == null)
            return null;
        Arrays.sort(S);
        System.out.println(Arrays.toString(S));
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < S.length; i++) {
            ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
            //get sets that are already in result
            for (ArrayList<Integer> a : result) {
                temp.add(new ArrayList<Integer>(a));
            }
            //add S[i] to existing sets
            for (ArrayList<Integer> a : temp) {
                a.add(S[i]);
            }
            //add S[i] only as a set
            ArrayList<Integer> single = new ArrayList<Integer>();
            single.add(S[i]);
            temp.add(single);
            result.addAll(temp);
            System.out.println("temp : "+temp);
            System.out.println("result is :"+result);
        }
        //add empty set
        result.add(new ArrayList<Integer>());
        return result;
    }
}

