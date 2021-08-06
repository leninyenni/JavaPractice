package interviewQuestions.telegramSource.JavaExercises.June20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadAFileWays {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("D:\\Testdata\\textfiles\\abc.txt"));
      String string;
        while (( string = br.readLine()) != null)
            System.out.println(string);
        System.out.println("--------------------------------");
    }
}

