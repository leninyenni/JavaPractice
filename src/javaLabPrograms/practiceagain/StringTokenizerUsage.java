package javaLabPrograms.practiceagain;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
public class StringTokenizerUsage {
	public static void main(String[] args) {
		String toCheck = "Lenin Kumar Yenni Lenin Kumar Lenin Yenni";
		StringTokenizer st = new StringTokenizer(toCheck);
		String[] words = new String[st.countTokens()];
		HashMap<String, Integer> stringcountMap = new HashMap<String, Integer>();
		int i = 0;
		while (st.hasMoreTokens()) {
			words[i] = st.nextToken();
			i++;
		}
		for (String str : words) {
			if (stringcountMap.containsKey(str)) {
				// If string is present in stringcountMap,
				// incrementing it's count by 1
				stringcountMap.put(str, stringcountMap.get(str) + 1);
			} else {
				// If char is not present in charCountMap,
				// putting this char to charCountMap with 1 as it's value
				stringcountMap.put(str, 1);
			}
		}
		// Printing the charCountMap
		for (Map.Entry entry : stringcountMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println(Arrays.toString(words));
	}
}
