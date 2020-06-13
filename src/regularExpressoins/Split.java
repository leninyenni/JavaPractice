package regularExpressoins;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Split {
	public static void main(String[] args) {
		//Pattern p = Pattern.compile("\\s"); //split with a space and if u want to split with specific charater replace \\s with that character
		Pattern p = Pattern.compile("\\.");// or u can write Pattern.compile("[.]")
		//String[] str = p.split("durga software  solutions");
		String[] str = p.split("durga.software.solutions");
		for (String s : str)
			System.out.println(s);
		
		
		//String class split() method
		
		String s= "Durga Soft Solutions";
		String[] sar= s.split("\\s");
		for(String s1: sar)
			System.out.println(s1);
		
		StringTokenizer st= new StringTokenizer("durga soft jobs india");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}
