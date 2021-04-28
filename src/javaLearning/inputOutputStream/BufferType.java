package javaLearning.inputOutputStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferType {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br= new BufferedReader(new FileReader("E:\\File\\input.txt"));
		BufferedWriter bw= new BufferedWriter(new FileWriter("E:\\File\\output.txt"));
		
		String line;
		
		while ((line=br.readLine()) != null)// if reading first line completed cursor moves to second line and checks if its null
		{
			System.out.println(line);
			bw.write(line);
			bw.newLine();
		}
		br.close(); //always recommend to close buffer objects to avoid data leakages
		bw.close();
		
		
	}

}
