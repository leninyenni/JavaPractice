package telegramSource.JavaExercises;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
public class ReadExcelSheetDataAll {
	public static Map<String, Map<String, Integer>> setMapData()
			throws IOException {
		String path = "E:\\JAVA\\InputDataRead.xls";
		FileInputStream fis = new FileInputStream(path);
		Workbook workbook = new HSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
		int lastRow = sheet.getLastRowNum();
		Map<String, Map<String, Integer>> excelFileMap = new HashMap<String, Map<String, Integer>>();
		
		// Looping over entire row
		for (int i = 0; i <= lastRow; i++) {
			Row row = sheet.getRow(i);
			Map<String, Integer> dataMap = new LinkedHashMap<String, Integer>();
			for (int j = 1; j <row.getPhysicalNumberOfCells(); j++) {
				
				// 1st Cell as Value
				Cell valueCell = row.getCell(j);
				// 0th Cell as Key
				Integer value = Integer.parseInt(valueCell.getStringCellValue());
				if (j == 1) {
					dataMap.put("Monday Price", value);
				}
				if (j == 2) {
					dataMap.put("Tuesday Price", value);
				}
				if (j == 3) {
					dataMap.put("Wednesday Price", value);
				}
				if (j == 4) {
					dataMap.put("Thursday Price", value);
				}
				if (j == 5) {
					dataMap.put("Friday Price", value);
				}
				if (j == 6) {
					dataMap.put("Saturday Price", value);
				}
				if (j == 7) {
					dataMap.put("Sunday Price", value);
				}
			}
			Cell keyCell = row.getCell(0);
			String key = keyCell.getStringCellValue().trim();
			// Putting dataMap to excelFileMap
			excelFileMap.put(key, dataMap);
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
		ReadExcelSheetDataAll r = new ReadExcelSheetDataAll();
		// Integer val = r.getMapData("search");
		System.out.println(setMapData());
	}
}