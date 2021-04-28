package companies.intrvwQustns.WiproPractice;
public class test1 {
	static String check(String[] ar) {
		String word = "";
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == "Yenni" || ar[i] == "Lenin") {
				word += ar[i];
			}
			else
			{
				return "Pora";
			}
		}
		return word;
	}
	public static void main(String[] args) {
		String[] arr = { "a", "Kumar", "Yenni", "Lenin", "b", "c", "d" };
		System.out.println(check(arr));
	}
}
