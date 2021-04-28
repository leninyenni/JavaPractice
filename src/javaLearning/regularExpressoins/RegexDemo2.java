package javaLearning.regularExpressoins;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {
	
	public static void main(String[] args)
	{
		
		
		
		String x="[a-z 0-9]"; //any alpha character
		Pattern p= Pattern.compile(x);
		
		Matcher m=p.matcher("ab@15abc");
		
		while(m.find())
		{
			System.out.println("positions are:"+m.start()+"group:"+m.group());
		}
		
				
	}
}
