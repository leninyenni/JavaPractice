package telegramSource.InterviewPrograms;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
public class MostRepeatedNumEnhancedByL {
	public static void main(String[] args) {
		int[] arr = {  2, 12, 5, 4, 12, 3, 4, 2, 4, 5, 12, 5, 14, 3, 5,12};
		int maxKey = 0;
		int maxValue = 0;
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (!hash.containsKey(arr[i]))
				hash.put(arr[i], 1);
			else
				hash.put(arr[i], hash.get(arr[i]) + 1);
			maxValue=(hash.get(arr[i]));
		}
		
		System.out.println(hash);
		
		System.out.println(maxValue);
		Set<Entry<Integer, Integer>> s1 = hash.entrySet();
		Iterator<Entry<Integer, Integer>> i1 = s1.iterator();
		while (i1.hasNext()) {
			Entry<Integer, Integer> entry = i1.next();
			if (entry.getValue() >= maxValue) {
				maxKey = entry.getKey();
				maxValue = entry.getValue();
				System.out.println("The winner is number " + maxKey
						+ " its frequency of occurrence is " + maxValue);
			}
		}

	}
}
