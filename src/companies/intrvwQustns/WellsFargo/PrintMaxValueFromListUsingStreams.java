package companies.intrvwQustns.WellsFargo;

import java.util.Arrays;
import java.util.List;

public class PrintMaxValueFromListUsingStreams {
    public static void main(String[] args) {
        // Creating a list of integers
        List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);

        System.out.print("The maximum value is : ");

        // Using stream.max() to get maximum
        // element according to provided Comparator
        // and storing in variable var
        Integer var = list.stream().max(Integer::compare).get();

        System.out.print(var);
    }
}
