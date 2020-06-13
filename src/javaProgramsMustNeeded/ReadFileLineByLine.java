package javaProgramsMustNeeded;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadFileLineByLine {
	public static void main(String[] args) throws IOException {
		String s = null;
		BufferedReader br = new BufferedReader(new FileReader("D:\\Desktop\\FileRead.txt"));
		while ((s = br.readLine()) != null) {
			System.out.println(s);
		}
	}
}
