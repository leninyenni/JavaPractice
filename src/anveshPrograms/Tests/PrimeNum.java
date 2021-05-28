package anveshPrograms.Tests;

import java.util.ArrayList;

public class PrimeNum {
    public static void main(String args[]) {
        PrimeNum p1=new PrimeNum();
        System.out.println(p1.sieve(7));

    }

    public ArrayList<Integer> sieve(int A) {
        int i,j,flag=0;
        ArrayList<Integer> al = new ArrayList<>();
        for (i = 1; i <= A; i++) {

            // Skip 0 and 1 as they are
            // niether prime nor composite
            if (i == 1 || i == 0)
                continue;

            // flag variable to tell
            // if i is prime or not
            flag = 1;

            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }

            // flag = 1 means i is prime
            // and flag = 0 means i is not prime
            if (flag == 1)
                al.add(i);

        }
        return  al;
    }
}