package javaLearning.regularExpressoins;
public class RegExWrkArnd {
	public static void main(String[] args) {
		String str = "abcd123123123abc 1 abbb       ccddd  123";
		if (str.matches(".*\\d.*")) {
			System.out.println(str);
			/*str=str.replaceAll("[0-9]", " ");
			System.out.println(str);*/
			//System.out.println(str.replaceAll(" +"," ")); //replacing all spaces with a single space
		System.out.println(str.replaceAll("\\s{3,}", "*").trim()); //replacing 3 or more spaces with *
		} else {
			System.out.println("no");
		}
	}
}
