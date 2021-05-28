package anveshPrograms.Tests;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class ArrayMath {
    public static void main(String args[]) {
        ArrayList al=new ArrayList<Integer>();
        al.add(1);
        al.add(3);
        al.add(-1);
        al.add(2);
        al.add(5);
        al.add(-2);
        al.add(7);
        al.add(9);
        al.add(-10);
        ArrayMath a1=new ArrayMath();
       System.out.println("method 1 :"+a1.maxArr(al));
       System.out.println("method 2 :"+a1.maxArr1(al));
    }

    public int maxArr1(ArrayList<Integer> Al) {
        int maxNum = 0;
        Instant start = Instant.now();
        for (int i = 0; i < Al.size(); i++) {
            for (int j = 0; j < Al.size(); j++) {
                int modvalue = Math.abs(Math.subtractExact(Al.get(i),Al.get(j)))+Math.abs(Math.subtractExact(i,j));
                if (modvalue > maxNum) {
                    maxNum = modvalue;
                }
            }

        }
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        //System.out.println("timeelapsed in method 1 "+ timeElapsed);
        return maxNum;
    }
    public int maxArr(ArrayList<Integer> A) {
        int tempSum = -1, tempDiff = -1;
        int minOfSum = Integer.MAX_VALUE, minOfDiff = Integer.MAX_VALUE;
        int maxOfSum = Integer.MIN_VALUE, maxOfDiff = Integer.MIN_VALUE;
       // Instant start = Instant.now();
        for(int i = 0; i < A.size(); i++){

            tempSum = A.get(i) + i;
            if(tempSum > maxOfSum){
                maxOfSum = tempSum;
            }
            if(tempSum < minOfSum){
                minOfSum = tempSum;
            }
            tempDiff = A.get(i) - i;
            if(tempDiff > maxOfDiff){
                maxOfDiff = tempDiff;
            }
            if(tempDiff < minOfDiff){
                minOfDiff = tempDiff;
            }
        }
        return Math.max((maxOfSum - minOfSum), (maxOfDiff - minOfDiff));
    }
}
