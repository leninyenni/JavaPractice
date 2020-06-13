package javaProgramsMustNeeded;
public class OnlyNumeric {
	public static void main(String[] args) {
		String s = "Struggle12for5andind829";
		String s2 = "";
		String arr[] = s.split("[a-z A-Z]+");
		for (String s1 : arr) {
			System.out.println(s1);
			s2 = s2 + s1.trim();
		}
		// System.out.println(s2);
		char[] ch = s2.toCharArray();
		for (Character c : ch) {
			System.out.print(c + ",");
			
		}
		
		System.out.println();
		System.out.println("**********************");
		//get only alpha values
		
		String s3 = "";
		String arr1[] = s.split("[0-9]+"); 
		for (String s1 : arr1) {
			System.out.println(s1);
			s3 = s3 + s1.trim();
		}
		// System.out.println(s2);
		char[] ch1 = s3.toCharArray();
		for (Character c : ch1) {
			System.out.print(c + ",");
		}
		
	}
}
