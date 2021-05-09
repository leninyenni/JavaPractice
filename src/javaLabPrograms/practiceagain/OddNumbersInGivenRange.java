package javaLabPrograms.practiceagain;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersInGivenRange {
    @Test
    @Parameters({"firstNum", "secondNum"})
    public void oddBetweenRange(int startNum, int endNum) {
        List<Integer> oddlist = new ArrayList<>();
        for (int i = startNum; i < endNum; i++) {
            if (i % 2 != 0) {
                oddlist.add(i);
            }
        }
        System.out.println("Odd numbers between given numbers are :" + oddlist);
    }
}
