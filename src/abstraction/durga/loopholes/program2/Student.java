package abstraction.durga.loopholes.program2;
public class Student extends Person {
	int rollno;
	int marks;
	Student(String name, int age, int rollno, int marks) {
		super(name, age);
		this.rollno = rollno;
		this.marks = marks;
	}
	public static void main(String[] args) {
		Student s = new Student("lenin", 30, 123456, 90);
	}
}
