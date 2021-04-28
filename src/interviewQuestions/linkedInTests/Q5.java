package interviewQuestions.linkedInTests;
import java.util.ArrayList;
import java.util.List;
public class Q5 {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		list.add("hello");
		list.add(2);
		System.out.println(list.get(0) instanceof String);
		System.out.println(list.get(0) instanceof Object);
		System.out.println(list.get(1) instanceof Integer);
	}
}
