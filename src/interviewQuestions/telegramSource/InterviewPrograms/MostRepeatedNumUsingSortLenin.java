package interviewQuestions.telegramSource.InterviewPrograms;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class MostRepeatedNumUsingSortLenin {
	public static void main(String[] args) {
		int arr[] = { 4,3, 3, 4, 4 };
		int element = 0;
		int count = 0;
		int max = 0;
		Set<Integer> al = new HashSet<Integer>();
		int element1 = 0;
		int count1 = 0;
		for (int i = 0; i < arr.length; i++) {
			int tempElement = arr[i];
			int tempCount = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == tempElement) {
					tempCount++;
				}
			}
			if (tempCount >= count1) {
				element1 = tempElement;
				count1 = tempCount;
				al.add(element1);
			}
		}
		System.out.println(al);
		Iterator<Integer> itr = al.iterator(); // traversing over HashSet
												// System.out.println("Traversing over Set using Iterator");
												// while(itr.hasNext()){
												// System.out.println(itr.next());
												// }
		System.out.println("Traversing over Set using Iterator");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
