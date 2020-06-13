package regularExpressoins;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GetURLvauesfromText {
	public static void main(String[] args) throws IOException {

		  
		  // We need to provide file path as the parameter: 
		  // double backquote is to avoid compiler interpret words 
		  // like \test as \t (ie. as a escape sequence) 
		  File file = new File("C:\\Users\\Lenin\\Downloads\\text\\jsonreadfull.txt"); 
		  
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  
		  String st; 
		  while ((st = br.readLine()) != null)
		  {
		    if(st.startsWith("url"))
		    {
		    	String[] str= st.split("\\s");
		    	System.out.println("URL is-----------"+str[1]);
		    }
		  }
		  } 
	}

