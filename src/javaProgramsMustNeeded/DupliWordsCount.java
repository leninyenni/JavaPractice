package javaProgramsMustNeeded;
public class DupliWordsCount {
	public static void main(String[] args) {
		String s = "raghu ne raghu se kaha ki raghu nahi aayega";
		String[] arr = s.split("raghu");
		System.out.println((arr.length) - 1);
	}
}
