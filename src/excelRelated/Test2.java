package excelRelated;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Test2 {
	// write into excel
	public static void main(String[] args) throws IOException {

		File src = new File("E:\\JAVA\\Sample.xls");
		FileInputStream fis = new FileInputStream(src); // creating channel to
														// file 
		HSSFWorkbook wb = new HSSFWorkbook(fis); // creating instance of file to .xls files

		HSSFSheet s = wb.getSheet("Sheet1");
		 System.out.println(s.getLastRowNum());

		s.getRow(4).createCell(2).setCellValue("HI ra gottam"); //set value =10
		//
		FileOutputStream fos= new FileOutputStream(src);
		 wb.write(fos);

		 fis.close();
		 fos.close();

	}
}
