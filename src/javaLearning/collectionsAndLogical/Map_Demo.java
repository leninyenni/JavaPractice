package javaLearning.collectionsAndLogical;
import java.util.HashMap;
import java.util.Map;
/* It used to hold key value pairs
2. Underlying data Structure is HashTable.
3. Duplicate keys are not allowed but values can be duplicated.
4. Insertion order is not preserved.
5. Null is allowed for key (only once)and allows for values any number of times.
6. Every method is non-synchronized so multiple Threads are operate at a time hence permanence is high.
*/
public class Map_Demo {
	public static void main(String[] args) {
		// Creating an empty Map
		Map<Integer, String> map = new HashMap<Integer, String>();
		// Mapping string values to int keys
		map.put(10, "Geeks");
		map.put(15, "4");
		map.put(20, "Geeks");
		map.put(25, "Welcomes");
		map.put(30, "You");
		// Displaying the Map
		System.out.println("Initial Mappings are: " + map);
		// Using entrySet() to get the set view
		System.out.println("The set is: " + map.entrySet());
	}
}
