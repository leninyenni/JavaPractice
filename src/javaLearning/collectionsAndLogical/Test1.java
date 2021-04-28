package javaLearning.collectionsAndLogical;

import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
	public static void main(String[] args) {
		
		ArrayList<String> al= new ArrayList<String>();
		al.add("bata");
		al.add("anu");
		al.add("aaam");
		al.add("sravya");
		
		System.out.println("before sorting: " + al);
		
		Collections.sort(al);
		System.out.println("after sorting: "+ al);
	}
}
