package seleniumPrograms.DataDriven.library;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelConfig {
	XSSFWorkbook wb;
	XSSFSheet sheet;
	public ExcelConfig(String excelPath) {
		try {
			File src = new File(excelPath);
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheetAt(0);
		} catch (Exception e) {
			System.out.println(e);
			;
		}
	}
	public String getExcel(int sheetnumber, int row, int col) {
		String str = sheet.getRow(row).getCell(col).getStringCellValue();
		return str;
	}
	public int getRowCount(int i) {
		sheet = wb.getSheetAt(i);
		int row = sheet.getLastRowNum();
		row = row + 1;
		return row;
	}
}
