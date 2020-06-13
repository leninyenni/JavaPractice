package WiproPractice;
public class ExcludeVowelWord {
	public static void checkString(String s) {
		String[] string = s.split(" ");
		StringBuffer buffer = new StringBuffer();
		for (String s1 : string) {
			boolean resultflag = false;
			for (int i = 0; i < s1.length(); i++) {
				boolean result = s1.toLowerCase().charAt(i) == 'a'
						|| s1.toLowerCase().charAt(i) == 'e'
						|| s1.toLowerCase().charAt(i) == 'i'
						|| s1.toLowerCase().charAt(i) == 'o'
						|| s1.toLowerCase().charAt(i) == 'u';
				if (result == true) {
					resultflag = true;
					break;
				}
			}
			if (resultflag == false) {
				buffer.append(s1 + " ");
			}
		}
		System.out.println(buffer);
	}
	public static void main(String[] args) {
		checkString("my skc name klk lenin txt abc lmn");
	}
}