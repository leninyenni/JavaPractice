package regularExpressoins;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexDemo {
	public static void main(String[] args) {
		int count = 0;
		// by using class name if we are calling method and it returns same
		// class object such methods are called static factory methods
		// here compile is a static factory methods
		Pattern p = Pattern.compile("ab");// create a pattern object with
											// regular expression u are
											// searching for
		Matcher m = p.matcher("ababbaba"); // pass the sequence you want to
											// check to matcher method. we have
											// to send target string
		while (m.find()) // if match is found
		{
			count++;
			System.out.println(m.start());
		}
		System.out.println("number of occurences are :" + count);
	}
}
