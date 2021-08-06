package companies.intrvwQustns.Wipro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountOfLinesInATextFile {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\Testdata\\textfiles\\abc.txt"));
        int lineCount = 0;
        String data;
        while ((data = br.readLine()) != null) {
            lineCount++;
            System.out.println("Number of words in this line-"+lineCount+" is/are " + countOfWords(data));
            System.out.println("Number of characters in line-"+lineCount+" is/are " + characterCountInEachLine(data));
        }
        System.out.println("total number of lines :" + lineCount);

    }

    private static int countOfWords(String line) {
        String[] arrayOfWords = line.split(" ");
        return arrayOfWords.length;
    }

    public static int characterCountInEachLine(String string) {
        return string.length();
    }

}
