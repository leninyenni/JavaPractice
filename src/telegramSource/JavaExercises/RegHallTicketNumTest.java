package telegramSource.JavaExercises;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
public class RegHallTicketNumTest {

	public static void main(String[] args) {
		List<String> messages = new ArrayList<>();
		messages.add("Your application has been accepted and your registration number is 093467 and your hall ticket number is BNG32016");
		messages.add("Application number 9823019348 has been accepted. 0955693 is your hall ticket number.");
		messages.add("Hall ticket is generated with number 39458 for the application AB123XZ");
		Map<String, String> registrationHallTicketNumbersMap = new LinkedHashMap<>();
		for (String message : messages) {
			String[] messageArr = message.split(" ");
			boolean isRegistrationNumberFlag = false;
			String registrationNumber = null;
			String hallTickerNumber = null;
			for (int i = 0; i < messageArr.length; i++) {
				if (messageArr[i].equalsIgnoreCase("registration")
						|| messageArr[i].equalsIgnoreCase("Application")) 
				{
					isRegistrationNumberFlag = true;
				}
				if (messageArr[i].matches(".*\\d.*")) 
				{
					if (isRegistrationNumberFlag) {
						registrationNumber = messageArr[i];
						isRegistrationNumberFlag = false;
					} else {
						hallTickerNumber = messageArr[i];
					}
				}
			}
			registrationHallTicketNumbersMap.put(registrationNumber,
					hallTickerNumber);
		}
		System.out.println("Registration Number" + " " + "Hallticket Number");
		for (Map.Entry<String, String> entry : registrationHallTicketNumbersMap
				.entrySet()) {
			System.out.printf("%-20s %s\n", entry.getKey(), entry.getValue());
		}
	}}
