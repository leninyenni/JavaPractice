package regularExpressoins;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PredefinedCharacterClasses {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\s"); //we need to add one more backslash so that compiler will identify appropriate regex
		Matcher m = p.matcher("ab@ 15abc");
		while (m.find()) {
			System.out.println(m.start()+"---"+ m.group());
		}
	}
}
