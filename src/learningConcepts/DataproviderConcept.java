package learningConcepts;
import java.util.Arrays;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DataproviderConcept {
	@DataProvider(name = "data")
	public static Object[][] getData() {
		Object[][] obj = new Object[3][2];
		obj[0][0] = "apple";
		obj[0][1] = "orange";
		obj[1][0] = "banana";
		obj[1][1] = "grape";
		obj[2][0] = "fruitnut";
		obj[2][1] = "strawberry";
		return obj;
	}
	@Test(dataProvider = "data")
	public void printData(String s1, String s2) {
		System.out.println(s1 + "-------" + s2);
	}
	public static void main(String[] args) {
		/*Object[][] obj = new Object[2][4];
		obj[0][0] = 1;
		obj[0][1] = 2;
		obj[0][2] = 3;
		obj[0][3] = 4;
		obj[1][0] = 5;
		obj[1][1] = 6;
		obj[1][2] = 7;
		obj[1][3] = 8;
		for (int i = 0; i < obj.length; i++) {
			System.out.println(Arrays.toString(obj[i]));
		}*/
		
		Object[][] fruit= getData();
		System.out.println(fruit.length);
		for (int i = 0; i < fruit.length; i++) {
		System.out.println(Arrays.toString(fruit[i]));
	}
	}
}
