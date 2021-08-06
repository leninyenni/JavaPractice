package interviewQuestions.InterviewPrograms;

public class NonRepeatedCharInAString {
    public static void main(String[] args) {
        String input = "llnne";
        for (int i = 0; i < input.length(); i++) {
            if (input.indexOf(input.charAt(i)) == input.lastIndexOf(input.charAt(i)))
                System.out.println(input.charAt(i));
        }
    }
}
