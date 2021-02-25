package seleniumPrograms.Notes;

import java.io.FileWriter;

public class TextFileWriterExample {
	public static void main(String args[]){    
        try{    
          FileWriter fw=new FileWriter("D:\\Selenium Training\\sample.txt");    
          fw.write("Welcome to File writing concept");    
          fw.close();    
         }catch(Exception e){System.out.println(e);}    
         System.out.println("Success...");    
    }    
}
