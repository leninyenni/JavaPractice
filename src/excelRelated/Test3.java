package excelRelated;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

public class Test3 {

	void readExcel() throws IOException
	{
		File src = new File("E:\\File\\CUTOVER.xls");
		FileInputStream fis = new FileInputStream(src); // creating channel to
														// file
		HSSFWorkbook wb = new HSSFWorkbook(fis); // creating instance of file

		HSSFSheet s = wb.getSheet("WI's");
		 System.out.println(s.getLastRowNum());
		
		 //Using Array
		 
		/* Object a[]= new Object[s.getLastRowNum()];
		
		 Iterator itr= s.iterator();
		 itr.next();
		for(int i=0;i<s.getLastRowNum();i++)
		{
			Row row= (Row) itr.next();
			
			a[i]= new DataFormatter().formatCellValue(row.getCell(0));
		System.out.println(a[i]);
		}
		*/
		//using List
		 ArrayList list= new ArrayList();
		 Iterator itr= s.iterator();
		 itr.next();
		for(int i=1;i<s.getLastRowNum()+1;i++)
		{
			Row row= (Row) itr.next();
			if(i%2==0)
			{
			s.getRow(i).createCell(10).setCellValue("Fail");
			}
			else
			{
				s.getRow(i).createCell(10).setCellValue("Pass");
			}
			//list.add(new DataFormatter().formatCellValue(row.getCell(8))) ;
		}
		 
		FileOutputStream fos= new FileOutputStream(src);
		//System.out.println(list); //not to get duplicate values use LinkedList
		wb.write(fos);
		System.out.println("written");
		fis.close();
	}
	public static void main(String[] args) throws IOException {
		Test3 t3= new Test3();
		t3.readExcel();
	}

}
