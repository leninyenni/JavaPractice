package collectionsAndLogical;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMap_Demo {
	public static void main(String[] args) {
		// Creating an empty TreeMap
		//SortedMap<String, Integer> sotree_map = new TreeMap<String, Integer>();
		// Mapping int values to string keys
	/*	sotree_map.put("Geeks", 10);
		sotree_map.put("4", 15);
		sotree_map.put("Geeks", 20);
		sotree_map.put("Welcomes", 25);
		sotree_map.put("You", 30);*/
		SortedMap<Integer, String> sotree_map = new TreeMap<Integer, String>();
		sotree_map.put(10, "Geeks");
		sotree_map.put(15, "4");
		sotree_map.put(20, "Geeks");
		sotree_map.put(25, "Welcomes");
		sotree_map.put(30, "You");
		
		// Displaying the TreeMap
		System.out.println("Initial Mappings are: " + sotree_map);
		// Using entrySet() to get the set view
		System.out.println("The set is: " + sotree_map.entrySet());
	}
}
