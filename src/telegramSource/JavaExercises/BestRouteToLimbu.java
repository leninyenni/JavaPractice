package telegramSource.JavaExercises;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
public class BestRouteToLimbu {
	
	public static Map<String, Map<String, Integer>> setMapData()
			throws IOException {
		String path = "E:\\JAVA\\Routes.xls";
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
				
			}
			Cell keyCell = row.getCell(0);
			String key = keyCell.getStringCellValue().trim();
			// Putting dataMap to excelFileMap
			excelFileMap.put(key, dataMap);
		}
		// Returning excelFileMap
		return excelFileMap;
	}
	
	
	static Map<String, String> Route1 = new LinkedHashMap<String, String>();
	static Map<String, String> Route2 = new LinkedHashMap<String, String>();
	static Map<String, String> Route3 = new LinkedHashMap<String, String>();
	static Map<String, LinkedHashMap<String, String>> Day = new LinkedHashMap<String, LinkedHashMap<String, String>>();
	public static LinkedHashMap<String, String> Route1OnMonday() {
		Route1.put("M", "CHK");
		Route1.put("A", "LOW");
		Route1.put("E", "CHK");
		return (LinkedHashMap<String, String>) Route1;
	}
	public static LinkedHashMap<String, String> Route2OnMonday() {
		Route2.put("M", "HIGH");
		Route2.put("A", "MED");
		Route2.put("E", "CHK");
		return (LinkedHashMap<String, String>) Route2;
	}
	public static LinkedHashMap<String, String> Route3OnMonday() {
		Route3.put("M", "MED");
		Route3.put("A", "LOW");
		Route3.put("E", "HIGH");
		return (LinkedHashMap<String, String>) Route3;
	}
	public static void DayDataOnMonday() {
		Day.put("Monday R1", Route1OnMonday());
		Day.put("Monday R2", Route2OnMonday());
		Day.put("Monday R3", Route3OnMonday());
	}
	public static void trafficOnMonday(String day) {
		Collection<LinkedHashMap<String, String>> routData = Day.values();
		System.out.println(routData);
		
		for (Entry<String, LinkedHashMap<String, String>> entry : Day
				.entrySet()) {
			LinkedHashMap<String, String> daywise = entry.getValue();
			Set<Entry<String, String>> everyday = daywise.entrySet();
			for (Entry<String, String> evryentry : everyday) {
				
				if (evryentry.getValue().equals("LOW")) {
					System.out.println(entry.getKey()+"--"+evryentry.getKey());
					
				}
				
			}
		}
		/*
		 * if(day.contains("Monday")) { for(HashMap obj: routData) {
		 * if(obj.containsValue("LOW")) { } } }
		 */
	}
	public static void main(String[] args) {
		DayDataOnMonday();
		// Collection<HashMap<String, String>> routData=Day.values();
		// System.out.println(routData);
		trafficOnMonday("Monday");
	}
}
