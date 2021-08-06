package interviewQuestions.InterviewPrograms;

public class NTimeRepeatedCharacterInAString {

    public static void main(String[] args) {
        String str = "malayalam";
        char[] charArrayarray = str.toCharArray();
        for (char c : charArrayarray) {
            presenceOfElement(c, str);
        }
    }
    public static void presenceOfElement(char c, String string) {
        int elementtherecount = 0;
        for (int i = 0; i < string.length(); i++) {
            if (c == string.charAt(i)) {
                elementtherecount++;
            }
        }
        //Here if you want to get a char which is repeating n times then just change the value to n inplace of 1 in below
        if (elementtherecount == 1) {
            System.out.println(c);
        }

    }
}
