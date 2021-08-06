package javaLearning.inputOutputStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferType {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\Testdata\\textfiles\\abc.txt"));
        //BufferedWriter bw= new BufferedWriter(new FileWriter("D:\\Testdata\\textfiles\\abc.text"));
        String line;
        int count = 0;
        while ((line = br.readLine()) != null)// if reading first line completed cursor moves to second line and checks if its null
        {
            System.out.println(line);
            //bw.write(line);
            //bw.newLine();
            count++;
        }
        
        br.close(); //always recommend to close buffer objects to avoid data leakages
        //bw.close();
        System.out.println("Number of lines: "+count);
    }


}
