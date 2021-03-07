package JavaIntroduction.abstraction.constructor.loopholes.three;
public class Student extends Person {
	int rollno, marks;
	public Student(String name, int age, int height, int weight) {
		super(name, age, height, weight);
		this.rollno = rollno;
		this.marks = marks;
	}

	public static void main(String[] args) {
		Student student=new Student("ramu", 30,8,60);
	}
}
