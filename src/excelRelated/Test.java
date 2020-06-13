package excelRelated;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

public class Test {
	//read from excel
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis= new FileInputStream("E:\\JAVA\\Sample.xls"); //creating channel to file
		HSSFWorkbook wb= new HSSFWorkbook(fis);  //creating instance of file
		
		HSSFSheet s= wb.getSheet("Sheet1");
		System.out.println(s.getLastRowNum());
		
		Iterator<Row> itr=s.iterator();
		ArrayList<String> username= new ArrayList<String>();
		ArrayList<String> password= new ArrayList<String>();
		itr.next();
		while(itr.hasNext())
		{
			Row r=itr.next();
			username.add(r.getCell(0).getStringCellValue());
			password.add(r.getCell(1).getStringCellValue());
		}
		System.out.println(username); //collection object printing gives values in brackets
		System.out.println(password);
		
		
		
	fis.close();

	}	
}
