package companies.intrvwQustns.OpenText.RoundTwo;

import java.util.ArrayList;
import java.util.List;

public class ValuesAtPrimeIndexes {
    public static boolean isPrime(int index) {
        boolean isPrime = true;
        for (int i = 2; i < index; i++) {
            if (index % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            return true;
        } else {
            return false;
        }
    }

    public static List<Integer> listOfNumbersAtPrimeIndexes(int[] input) {
        List<Integer> listOfNums = new ArrayList<>();
        for (int i = 2; i < input.length; i++) {
            if (isPrime(i)) {
                listOfNums.add(input[i]);
            }
        }
        return listOfNums;
    }

    public static void filterPrimesFromListOf(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            boolean isPrime = true;
            for (int j = 2; j < list.get(i); j++) {
                if (list.get(i) % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(list.get(i));
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 11, 11, 11, 11};
        System.out.println(listOfNumbersAtPrimeIndexes(numbers));
        filterPrimesFromListOf(listOfNumbersAtPrimeIndexes(numbers));
    }
}
