package javaLearning.inputOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis= new FileInputStream("E:\\File\\input.txt");
		FileOutputStream fos= new FileOutputStream("E:\\File\\op2.txt");
		int c;
		while((c=fis.read())!=-1) // -1 represents end of the stream
		{
			System.out.println((char)c); // checking data
			fos.write(c); //returns ascii code of character and we are writing in output file
		}
		fis.close(); // to overcome data losses its recommended to close the connections
		fos.close();
	}

}
