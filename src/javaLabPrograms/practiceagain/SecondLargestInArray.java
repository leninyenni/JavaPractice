package javaLabPrograms.practiceagain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestInArray {

    public static void main(String[] args) {
        int[] array= {41,31,51,32,39,17};
       List<Integer> list=Arrays.stream(array).boxed().sorted().collect(Collectors.toList());
        System.out.println(list);
        String arr[] = { "Aston Martin", "Bugatti", "Bentley", "Alfa Romeo", "Buick", "Acura", "Audi", "BMW", "Buick" };
//prints array before conversion
        System.out.println("Array before conversion: "+ Arrays.toString(arr));
        List<String> list1 = Arrays.asList(arr);
        System.out.println(list1);

List<Integer> list2= Arrays.asList(1,2,3);
        System.out.println(list2);


    }
}
