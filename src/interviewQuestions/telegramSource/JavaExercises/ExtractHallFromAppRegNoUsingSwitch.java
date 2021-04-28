package interviewQuestions.telegramSource.JavaExercises;
import java.util.HashMap;
import java.util.Map;
public class ExtractHallFromAppRegNoUsingSwitch {
	public static void main(String[] args) {
		String[] input = {
				"Your application has been accepted and your registration number is 093467 and your hall ticket number is BNG32016",
				"Application number 9823019348 has been accepted. 0955693 is your hall ticket number.",
				"Hall ticket is generated with number 39458 for the application AB123XZ" };
		Map<String, String> objMap = new HashMap<String, String>();
		int totalstrings = input.length;
 
		
		for (int i = 0; i < totalstrings; i++) {
			switch (i) {
			case 0:
				if (input[i].startsWith("Your application")) {
					String[] result = input[i].split("\\s");
					String regno = result[10];
					String hallno = result[result.length - 1];
					objMap.put(regno, hallno);
					break;
				} else {
					System.out
							.println("no input starting with Your application..");
					break;
				}
			case 1:
				if (input[i].startsWith("Application number")) {
					String[] result = input[i].split("\\s");
					String regno2 = result[2];
					String hallno2 = result[6];
					objMap.put(regno2, hallno2);
					break;
				} else {
					System.out
							.println("no input starting with Application number..");
					break;
				}
			case 2:
				if (input[i].startsWith("Hall ticket is generated")) {
					String[] result = input[i].split("\\s");
					String regno3 = result[6];
					String hallno3 = result[result.length - 1];
					objMap.put(regno3, hallno3);
					break;
				} else {
					System.out.println("Hall ticket is generated");
					break;
				}
			}
		}
		// using for-each loop for iteration over Map.entrySet()
		for (Map.Entry<String, String> entry : objMap.entrySet())
			System.out.println("Registration Number = " + entry.getKey()
					+ ", Hallticket Number = " + entry.getValue());
	}
}
