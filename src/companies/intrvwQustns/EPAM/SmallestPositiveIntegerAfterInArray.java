package companies.intrvwQustns.EPAM;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SmallestPositiveIntegerAfterInArray {

    public static void main(String[] args) {

        int[] intArray= {-1,-2,3,0,-4};
        List<Integer> integerArray = Arrays.stream(intArray).boxed().sorted().collect(Collectors.toList());
        System.out.println(integerArray);
        //Java converts Integer to int at run time or else you can use intValue on integer object to do so
       int value= integerArray.get(intArray.length-1) + 1;
       //int value= integerArray.get(intArray.length-1).intValue() + 1;
        System.out.println("Smallest positive integer after elements of array is : "+ value);
    }

}
