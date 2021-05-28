package anveshPrograms.Tests;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class StringCount {
    public static void main(String args[]) throws Exception {

        String testString = "Test";
        String filePath = "Test.txt";
        String strLine;
        int numRead = 0;

        try {
            FileInputStream fstream = new FileInputStream(filePath);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            while ((strLine = br.readLine()) != null) {
                strLine = strLine + " ";
                String[] strArry = strLine.split(testString);

                if (strArry.length > 1) {
                    numRead = numRead + strArry.length - 1;
                } else {
                    if (strLine == testString) {
                        numRead++;
                    }
                }
            }

            in.close();

            System.out.println(testString + " was found " + numRead + " times.");

        } catch (Exception e) {
        }
    }
}