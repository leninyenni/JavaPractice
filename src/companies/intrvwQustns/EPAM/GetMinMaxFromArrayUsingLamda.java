package companies.intrvwQustns.EPAM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@FunctionalInterface
interface SumOfMinMax {
    int sum(int[] array);
}

public class GetMinMaxFromArrayUsingLamda {
    /*Using lamda*/
    public static void main(String[] args) {
        int[] A = {11, 32, 16, 9, 98, 76, 43};
        SumOfMinMax sum = list1 -> {
            List<Integer> list = new ArrayList<>();
            for (int i : A) {
                list.add(i);
            }
            Collections.sort(list);
            System.out.println(list);
            int summation = list.get(0) + list.get(list.size() - 1);
            return summation;
        };
        System.out.println(sum.sum(A));

    }
}
