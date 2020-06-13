package sample;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DataProviderWorkAround {
	@Test(dataProvider = "from-one-dimensional")
	public void run(String str) {
		System.out.println(str);
	}
	// Data in one dimensional array
	@DataProvider(name = "from-one-dimensional")
	public Object[] arrayOfData1() {
		Object[] obj = { "lenin", "kumar", "yenni" };
		return obj;
	}
	@Test(dataProvider = "from-two-dimensional")
	public void run(String str1, String str2, String str3) {
		System.out.println(str1 + "---" + str2 + "---" + str3);
	}
	@DataProvider(name = "from-two-dimensional")
	public Object[][] arrayOfData2() {
		Object[][] obj = { { "lenin", "kumar", "yenni" },
				{ "vinu", "may be", "girl" } };
		return obj;
	}
	@DataProvider(name = "from-Map-Object")
	public Object[] arrayOfData3() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("username1", "password1");
		map.put("username2", "password2");
		map.put("username3", "password3");
		map.put("username4", "password4");
		Object[] obj = new Object[1];
		obj[0] = map;
		return obj;
	}
	@Test(dataProvider = "from-Map-Object")
	public void run(Map map) {
		// Get a set of the entries
		Set<Entry<String, String>> set = map.entrySet();
		// Get an iterator
		Iterator<Entry<String, String>> i = set.iterator();
		// Display elements
		while (i.hasNext()) {
			@SuppressWarnings("unchecked")
			Entry<String, String> me = (Entry<String, String>) i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		System.out.println();
	}
	@Test(dataProvider = "data-from-excel-hashmap")
	public void integrationTest(Map<Object, Object> map) {
		System.out.println("-------------Test case started ----------------");
		System.out.println(map.get("UserName"));
		System.out.println(map.get("Password"));
		System.out.println(map.get("Dob"));
		System.out.println("-------------Test case Ended ----------------");
	}
	@DataProvider(name = "data-from-excel-hashmap")
	public Object[][] dataSupplier() throws IOException {
		File file = new File("E://JAVA//DataProviderExcelHashMap.xls");
		FileInputStream fis = new FileInputStream(file);
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet sheet = wb.getSheetAt(0);
		wb.close();
		int lastRowNum = sheet.getLastRowNum();
		int lastCellNum = sheet.getRow(0).getLastCellNum();
		Object[][] obj = new Object[lastRowNum][1];
		for (int i = 0; i < lastRowNum; i++) {
			Map<Object, Object> datamap = new HashMap<>();
			for (int j = 0; j < lastCellNum; j++) {
				datamap.put(sheet.getRow(0).getCell(j).toString(), sheet
						.getRow(i + 1).getCell(j).toString());
			}
			obj[i][0] = datamap;
		}
		return obj;
	}
	@DataProvider(name = "excelData")
	public Object[][] readExcel() throws IOException {
		File file = new File("E://JAVA//DataProviderExcelHashMap.xls");
		FileInputStream fis = new FileInputStream(file);
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		HSSFSheet sheet = workbook.getSheet("ExcelData");
		int totalRows = sheet.getLastRowNum();
		int totalColums = sheet.getRow(0).getPhysicalNumberOfCells();
		// Read data from excel and store the same in the Object Array.
		Object obj[][] = new Object[totalRows][totalColums];
		for (int i = 0; i < totalRows; i++) {
			obj[i][0] = sheet.getRow(i + 1).getCell(0).toString();
			obj[i][1] = sheet.getRow(i + 1).getCell(1).toString();
		}
		return obj;
	}
	@Test(dataProvider = "excelData")
	public void validateUser(String userName, String password)
			throws InterruptedException {
		System.out.println(userName + "----" + password);
	}
}
