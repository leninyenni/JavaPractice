package javaLabPrograms.HashMapExamples.JavaConceptOfTheDay;
import java.util.HashMap;
import java.util.Map;
public class DiffWaysObjectCreation {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.replace("a", "1");
		System.out.println(map.get("a"));
		map.put("a", "1");
		System.out.println(map.get("a"));
		map.replace("a", "2");
		System.out.println(map.get("a"));
	}
}
