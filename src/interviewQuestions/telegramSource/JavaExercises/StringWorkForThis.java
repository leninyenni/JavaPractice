package interviewQuestions.telegramSource.JavaExercises;

public class StringWorkForThis {
	public static void main(String[] args) {
		
		//exclude all special characters only but include space in a sentence
		
		/*String text = "This - text ! has \\ /allot # of % special % characters";
		text = text.replaceAll("[^a-zA-Z0-9\\s]", "");
		System.out.println(text);
		
		
		
		String text2= "lenin 129 abc 5 1364666161655 kumar";
		
		String[] texts= text2.split("\\s");
		
		for(String str : texts)
		{
			if (str.matches(".*\\d.*"))
			{
				System.out.println(str);
			}
			else
			{
				System.out.println("this is not a number: "+str);
			}
		}
		*/
		
		
		String message="Hall ticket is generated with number 39458 for the application AB123XZ";
		String[] messageArr = message.split(" ");
		boolean isRegistrationNumber = false;
		String registrationNumber = null;
		String hallTickerNumber = null;
		for (int i = 0; i < messageArr.length; i++) {
			if (messageArr[i].equalsIgnoreCase("registration")
					|| messageArr[i].equalsIgnoreCase("Application")) {
				isRegistrationNumber = true;
			}
			if (messageArr[i].matches(".*\\d.*")) {
				if (isRegistrationNumber) {
					registrationNumber = messageArr[i];
					isRegistrationNumber = false;
				} else {
					hallTickerNumber = messageArr[i];
				}
			}
		}
		
		System.out.println(registrationNumber+"------------------"+hallTickerNumber);
	}
}
