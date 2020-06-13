package javaLabPrograms.HashMapExamples.JavaConceptOfTheDay;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
public class RetrieveKeysandValues {
	public static void main(String[] args) {
		// Creating the HashMap
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		// Adding key-value pairs to HashMap
		map.put(1, "AAA");
		map.put(2, "BBB");
		map.put(3, "CCC");
		map.put(4, "DDD");
		map.put(5, "EEE");
		// Retrieving the Key Set
		Set<Integer> keySet = map.keySet();
		for (Integer key : keySet) {
			System.out.println(key);
		}
		// Retrieving the Collection view of values present in map
		Collection<String> values = map.values();
		for (String value : values) {
			System.out.println(value);
		}
	}
}
