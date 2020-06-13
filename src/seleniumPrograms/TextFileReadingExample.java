package seleniumPrograms;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class TextFileReadingExample {
	public static void main(String[] args) throws Exception {
		// We need to provide file path as the parameter:
		// double back quote is to avoid compiler interpret words
		// like \test as \t (ie. as a escape sequence)
		File file = new File("D:\\Selenium Training\\Day13.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		while ((st = br.readLine()) != null)
			System.out.println(st);
	}
}
