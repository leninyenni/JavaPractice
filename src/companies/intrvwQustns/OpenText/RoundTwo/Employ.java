package companies.intrvwQustns.OpenText.RoundTwo;

public class Employ {
    int rollno;
    String name;
    // Constructor
    public Employ(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    // Used to print student details in main()
    public String toString() {
        return this.rollno + " " + this.name;
    }
}
