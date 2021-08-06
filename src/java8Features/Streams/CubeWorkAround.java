package java8Features.Streams;

import java.util.Arrays;
import java.util.List;

public class CubeWorkAround {

    public static void main(String[] args) {
        // create a list of integers
        List<Integer> number = Arrays.asList(2,3,4,5);

        // demonstration of map method
      number.stream().map(x -> x*x).forEach(x->System.out.println(x));

        number.stream().map(x -> x*x).forEach(System.out::println);
    }
}
