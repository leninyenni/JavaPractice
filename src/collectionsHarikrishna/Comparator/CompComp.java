package collectionsHarikrishna.Comparator;
import java.util.TreeSet;
public class CompComp {
	public static void main(String[] args) {
		Employee e1 = new Employee("nag", 100);
		Employee e2 = new Employee("balaiah", 200);
		Employee e3 = new Employee("chiru", 50);
		Employee e4 = new Employee("venki", 150);
		Employee e5 = new Employee("nag", 100);
		TreeSet T = new TreeSet();
		T.add(e1);
		T.add(e2);
		T.add(e3);
		T.add(e4);
		T.add(e5);
		System.out.println(T);
		TreeSet T1 = new TreeSet(new MyComparator());
		T1.add(e1);
		T1.add(e2);
		T1.add(e3);
		T1.add(e4);
		T1.add(e5);
		System.out.println(T1);
	}
}
