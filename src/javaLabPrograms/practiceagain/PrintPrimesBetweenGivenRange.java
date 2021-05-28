package javaLabPrograms.practiceagain;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/*Please give your inputs inside "primebetweenrange.xml"*/
/*Make a note that parameters we are sending to test method should be a void one
* other wise testng won't identify*/

public class PrintPrimesBetweenGivenRange {
    @Test
    @Parameters({"firstNum", "secondNum"})
    public void primeBetweenRange(int startNum, int endNum) {
       /* int startNum = Integer.parseInt(c);
        int endNum = Integer.parseInt(d);*/
        List<Integer> primelist = new ArrayList<>();
        int count = 0;
        for (int i = startNum; i <= endNum; i++) {
            count = 1;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0)
                    count++;
            }
            if (count == 2) {
                /*System.out.print(i + "\t");*/
                primelist.add(i);
            }
        }
        System.out.println(primelist);
    }

}
