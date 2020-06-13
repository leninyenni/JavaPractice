package telegramSource.JavaExercises;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
public class BestRouteToLimbuAdvanced {
	public static Map<String, LinkedHashMap<String, String>> setMapData()
			throws IOException {
		String path = "E:\\JAVA\\Routes.xls";
		FileInputStream fis = new FileInputStream(path);
		Workbook workbook = new HSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
		int lastRow = sheet.getLastRowNum();
		Map<String, LinkedHashMap<String, String>> Day = new LinkedHashMap<String, LinkedHashMap<String, String>>();
		// Looping over entire row
		for (int i = 1; i <= lastRow; i++) {
			Row row = sheet.getRow(i);
			String value;
			for (int j = 1; j < row.getPhysicalNumberOfCells();) {
				int k;
				Map<String, String> Route = new LinkedHashMap<String, String>();
				for (k = j; k < 3 + j; k++) {
					// 1st Cell as Value
					Cell valueCell = row.getCell(k);
					// 0th Cell as Key
					value = valueCell.getStringCellValue();
					if (k == 1 || k == 4 || k == 7) {
						Route.put("M", value);
					}
					if (k == 2 || k == 5 || k == 8) {
						Route.put("A", value);
					}
					if (k == 3 || k == 6 || k == 9) {
						Route.put("E", value);
						break;
					}
				}
				Cell keyCell = row.getCell(0);
				String key = keyCell.getStringCellValue().trim();
				if (j == 1) {
					Day.put(key + "Route1",
							(LinkedHashMap<String, String>) Route);
				}
				if (j == 4) {
					Day.put(key + "Route2",
							(LinkedHashMap<String, String>) Route);
				}
				if (j == 7) {
					Day.put(key + "Route3",
							(LinkedHashMap<String, String>) Route);
				}
				j = k + 1;
			}
		}
		// Returning excelFileMap
		return Day;
	}
	public static void CompleteWeekAnalysis(
			Map<String, LinkedHashMap<String, String>> Day) {
		Collection<LinkedHashMap<String, String>> routData = Day.values();
		System.out.println(routData);
		for (Entry<String, LinkedHashMap<String, String>> entry : Day
				.entrySet()) {
			LinkedHashMap<String, String> daywise = entry.getValue();
			Set<Entry<String, String>> everyday = daywise.entrySet();
			for (Entry<String, String> evryentry : everyday) {
				if (evryentry.getValue().equals("LOW")) {
					System.out.println(entry.getKey() + "--"
							+ evryentry.getKey());
				}
			}
		}
	}
	public static boolean whetherFastestThere(
			Map<String, LinkedHashMap<String, String>> Day, String day) {
		boolean isLowThere = false;
		boolean isMedThere = false;
		for (Entry<String, LinkedHashMap<String, String>> entry : Day
				.entrySet()) {
			if (entry.getKey().contains(day)) {
				LinkedHashMap<String, String> daywise = entry.getValue();
				Collection<String> allvalues = daywise.values();
				if (allvalues.contains("LOW")) {
					isLowThere = true;
				}
				if (allvalues.contains("MED")) {
					isMedThere = true;
				}
				//System.out.println(allvalues);
			}
		}
		if (!isLowThere && !isMedThere) {
			return true;
		}
		return false;
	}
	public static void SpecficDay(
			Map<String, LinkedHashMap<String, String>> Day, String whichday) {
		if (whetherFastestThere(Day, whichday)) {
			System.out.println("No fastest route on : " + whichday);
		}
		boolean isThere = false;
		for (Entry<String, LinkedHashMap<String, String>> entry : Day
				.entrySet()) {
			LinkedHashMap<String, String> daywise = entry.getValue();
			Set<Entry<String, String>> everyday = daywise.entrySet();
			for (Entry<String, String> evryentry : everyday) {
				if (evryentry.getValue().equals("LOW")
						&& entry.getKey().contains(whichday)) {
					System.out.println(entry.getKey() + "--"
							+ evryentry.getKey());
					isThere = true;
				}
			}
		}
		// this for loop is written because of reason that if any MED comes
		// before LOW in a row, then its taking
		// MED first and returning those values and after that LOW . So to fix
		// that have added this code
		// which would check only for MEDs if no LOWs
		if (!isThere) {
			for (Entry<String, LinkedHashMap<String, String>> entry : Day
					.entrySet()) {
				LinkedHashMap<String, String> daywise = entry.getValue();
				Set<Entry<String, String>> everyday = daywise.entrySet();
				for (Entry<String, String> evryentry : everyday) {
					if (evryentry.getValue().equals("MED")
							&& entry.getKey().contains(whichday)) {
						System.out.println(entry.getKey() + "--"
								+ evryentry.getKey());
					}
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		/*
		 * System.out.println(setMapData());
		 * 
		 * CompleteWeekAnalysis(setMapData());
		 * System.out.println("________________________");
		 */
		Scanner s = new Scanner(System.in);
		String dayYouWant = s.next();
		SpecficDay(setMapData(), dayYouWant);
	}
}
