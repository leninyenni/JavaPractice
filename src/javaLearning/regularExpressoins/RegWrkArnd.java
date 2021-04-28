package javaLearning.regularExpressoins;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegWrkArnd {
	
	public static void main(String[] args)
	{
		String str="my name is khan and my number is 8812365478 and other is 44464 and 556464";
		
		Pattern p = Pattern.compile("[1-9]*");
		 Matcher m = p.matcher(str); 
		 
		 while(m.find())
		 {
			 //System.out.println(m.group());
				System.out.println(m.start()+"---"+ m.group());
		 }
	}
}
