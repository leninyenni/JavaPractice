package companies.intrvwQustns.Amazon;

import java.util.ArrayList;
import java.util.Scanner;

public class SubArrayWithPrimes {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int lengthOfArray = scanner.nextInt();
        int[] primeNumbers = new int[lengthOfArray];
        for (int i = 0; i < lengthOfArray; i++) {
            primeNumbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < primeNumbers.length; i++) {
            boolean isPrime = true;
            for(int j =2;j < primeNumbers[i];j++) {
                if(primeNumbers[i] % j == 0)  {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                list.add(primeNumbers[i]);
            }
        }
        for (Integer value : list) {
            System.out.println(value);
        }
        System.out.println(list.size());

    }
}
