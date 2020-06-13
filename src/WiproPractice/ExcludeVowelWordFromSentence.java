package WiproPractice;
public class ExcludeVowelWordFromSentence {
	  public static void checkString(String s) {
	        String[] string = s.split(" ");
	        StringBuffer buffer = new StringBuffer();
	        for (String s1 : string) {
	            boolean isFound = false;
	            for (int i = 0; i < s1.length(); i++) {
	                if (s1.toLowerCase().charAt(i) == 'a' || s1.toLowerCase().charAt(i) == 'e'
	                        || s1.toLowerCase().charAt(i) == 'i' || s1.toLowerCase().charAt(i) == 'o'
	                        || s1.toLowerCase().charAt(i) == 'u') {
	                    isFound = true;
	                    break;
	                }
	            }
	            if(!isFound) {
	                buffer.append(s1+" ");
	            }
	        }
	        System.out.println(buffer);
	    }

	    public static void main(String[] args) {
	    	String str="my name lenin nxt";
	        checkString(str);
	    }
}
