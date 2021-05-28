package companies.intrvwQustns.EPAM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GetMinMaxFromArray {

    /*Find Min and Max value from the array and sum it*/
    /*Approach 1*/
    public static void main(String[] args) {
        int[] A = {11,32,16,9,98,76,43};

        List<Integer> list= new ArrayList<>();
        for(int i:A) {
            list.add(i);
        }
       Collections.sort(list);
        System.out.println(list);

        int minValue= list.get(0);
        int maxValue= list.get(A.length-1);
        System.out.println(minValue+maxValue);

        /*Approach 2*/
        int min= Collections.min(list);
        int max= Collections.max(list);
        System.out.println("Minmum value is :" +  min);
        System.out.println("Minmum value is :" +  max);

        /*Approach 3*/

        //min always give the first element in the sorted stream of list
       int minimum = list.stream().sorted().min((s1,s2)->s1.compareTo(s2)).get();
       int maximum = list.stream().sorted().min((s1,s2)->s2.compareTo(s1)).get();
        System.out.println(minimum);
        System.out.println(maximum);
    }
}
