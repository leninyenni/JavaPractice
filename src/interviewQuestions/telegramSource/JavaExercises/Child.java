package interviewQuestions.telegramSource.JavaExercises;

public class Child extends Parent{

    Child(String message) {
        super(message);
    }
    Child ()
    {
        super("Happy Eid");
    }
    public void celebrate()
    {
        System.out.println("Eid Mubarak");
    }
}
