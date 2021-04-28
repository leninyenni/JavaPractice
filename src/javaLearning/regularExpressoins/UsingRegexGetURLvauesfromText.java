package javaLearning.regularExpressoins;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsingRegexGetURLvauesfromText {
	public static void main(String[] args) throws IOException {

Pattern p= Pattern.compile("^((http[s]?|ftp):\\/)?\\/?([^:\\/\\s]+)((\\/\\w+)*\\/)([\\w\\-\\.]+[^#?\\s]+)(.*)?(#[\\w\\-]+)?$");
		  
		  BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenin\\Downloads\\text\\jsonreadfull.txt")); 
		  
		  String st; 
		  while ((st = br.readLine()) != null)
		  {
		   Matcher m= p.matcher(st);
		   
		   while(m.find())
		   {
			   System.out.println(m.group());
		    }
		   st=br.readLine();
		  }
		  } 
	}

