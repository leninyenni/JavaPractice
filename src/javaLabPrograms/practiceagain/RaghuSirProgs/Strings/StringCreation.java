package javaLabPrograms.practiceagain.RaghuSirProgs.Strings;
public class StringCreation {
	public static void main(String[] args) {
		String str1 = new String("Lenin");
		String str2 = new String("Lenin");
		if (str1 == str2) {
			System.out.println("string objects are equal using == operator");
		} else {
			System.out
					.println("strings created using new operator are not equal");
		}
		if (str1.equals(str2)) {
			System.out.println("string objects are equal using equals method");
		} else {
			System.out
					.println("strings created using new operator are not equal");
		}
		
		System.out.println("***********************************");
		System.out.println("Now check for strings with out new operator");
		String str3 = "Lenin";
		String str4 = "Lenin";
		if (str3 == str4) {
			System.out.println("string objects are equal using == operator");
		} else {
			System.out
					.println("strings created using new operator are not equal");
		}
		if (str3.equals(str4)) {
			System.out.println("string objects are equal using equals method");
		} else {
			System.out
					.println("strings created using new operator are not equal");
		}
		
		System.out.println("*********************************");
		
		String str5="Lenin";
		String str6= new String("Lenin");
		
		System.out.println(str5.equals(str6));
		System.out.println(str5==str6);
	}
}
