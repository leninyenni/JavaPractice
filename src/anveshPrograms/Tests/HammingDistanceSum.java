package anveshPrograms.Tests;

import java.util.ArrayList;
import java.util.List;

public class HammingDistanceSum {
    public static void main(String args[]) {

        HammingDistanceSum h1 = new HammingDistanceSum();
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(4);
        al.add(6);
        System.out.println(h1.hammingSum(al));

    }

    int hammingSum(final List<Integer> a) {
        int sum = 0;
        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int j = 0; j < a.size(); j++)
                if ((a.get(j) & (1 << i)) == 0)
                    count++;

                // Add "count * (n - count) * 2"
                // to the answer
                sum += (count * (a.size() - count) * 2);
                //sum=sum+gethammingDistance(a.get(i),a.get(j));

        }
        return sum;
    }

    public int gethammingDistance(int n1, int n2) {
        int distance = 0;
        int x = n1 ^ n2;
        int setBits = 0;

        while (x > 0) {
            distance += x & 1;
            x >>= 1;
        }

        return distance;
    }
}
