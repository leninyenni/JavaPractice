package interviewQuestions.telegramSource.JavaExercises;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ReadExcelSheetData {
	public static Map<String, Map<String, Integer>> setMapData()
			throws IOException {
		String path = "E:\\JAVA\\InputData.xls";
		FileInputStream fis = new FileInputStream(path);
		Workbook workbook = new HSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
		int lastRow = sheet.getLastRowNum();
		Map<String, Map<String, Integer>> excelFileMap = new HashMap<String, Map<String, Integer>>();
		Map<String, Integer> dataMap = new HashMap<String, Integer>();
		// Looping over entire row
		for (int i = 0; i < lastRow-1; i++) {
			Row row = sheet.getRow(i);
			// 1st Cell as Value
			Cell valueCell = row.getCell(1);
			// 0th Cell as Key
			Cell keyCell = row.getCell(0);
			Integer value = Integer.parseInt(valueCell.getStringCellValue());
			String key = keyCell.getStringCellValue().trim();
			// Putting key & value in dataMap
			dataMap.put(key, value);
			// Putting dataMap to excelFileMap
			excelFileMap.put("DataSheet", dataMap);
		}
		// Returning excelFileMap
		return excelFileMap;
	}
	// Method to retrieve value
	public static Integer getMapData(String key) throws IOException {
		Map<String, Integer> m = setMapData().get("DataSheet");
		Integer value = m.get(key);
		return value;
	}
	
	
	public static void main(String[] args) throws IOException {
		ReadExcelSheetData r = new ReadExcelSheetData();
		
		//Integer val = r.getMapData("search");
		
		System.out.println(setMapData());
 
	}
}