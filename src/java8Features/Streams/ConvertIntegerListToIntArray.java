package java8Features.Streams;

import java.util.ArrayList;
import java.util.List;

public class ConvertIntegerListToIntArray {
    public static void main(String[] args){

        List<Integer> numList = new ArrayList<Integer>();
        numList.add(11);
        numList.add(22);
        numList.add(33);
        numList.add(44);
        numList.add(55);

        int[] numArray = numList.stream().mapToInt(i->i).toArray();

        for (int intValue : numArray) {
            System.out.println(intValue);
        }
    }

}
