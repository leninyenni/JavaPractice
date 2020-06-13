package stringManipulations;

public class Point6 {
	// equals() ,equalsIgnoreCase(), compareTo(), compareToIgnoreCase()
	public static void main(String[] args) {
		//String Class equals method get executed
	/*	String s1= "ratan";
		String s2= "anu";
		String s3= "ratan";
		
		System.out.println(s1.equals(s2)); // false
		System.out.println(s1.equals(s3)); //true
		System.out.println(s2.equals(s3)); //false
		System.out.println("ANU".equals(s2)); //false
		System.out.println("RATAN".equalsIgnoreCase(s3)); //true..it ignores case of string
		
		// compareTo() method returns integer
		System.out.println(s1.compareTo(s2)); //+ve
		System.out.println(s1.compareTo(s3)); //zero
		System.out.println(s2.compareTo(s3)); // -ve
		System.out.println("ANU".compareTo(s2)); //-ve
		System.out.println("ANU".compareToIgnoreCase(s2));*/
	
	//Few String methods
		String str= "ratana";
		 
		System.out.println(str.charAt(2));
		//java.lang.StringIndexOutOfBoundsException
		//System.out.println(str.charAt(20));
		
		System.out.println(str.indexOf('a')); //returns integer
		System.out.println(str.lastIndexOf('a')); // returns integer
		
		String str1= "07R81A0525";
		System.out.println(str1.contains("81A")); //returns boolean
		System.out.println(str1.startsWith("07R")); //returns boolean
		System.out.println(str1.endsWith("525")); //returns boolean
		System.out.println("ratana".toUpperCase());
		System.out.println("RATANA".toLowerCase());
		
		System.out.println("  R A T A N  ".length());
		System.out.println("  R A T A N  ".trim()); //trim method used to remove starting and ending spaces
		System.out.println("  R A T A N  ".trim().length()); //first trim() method is applied and later length() applied on resultant
	}

}
