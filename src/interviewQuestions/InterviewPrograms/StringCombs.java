package interviewQuestions.InterviewPrograms;

public class StringCombs {
    public static void main(String[] args) {
        String str = "ABCD";
        //a,b,c,d,ab,bc,cd,abc,bcd,abcd
            for (int i = 0; i < str.length(); i++) {
            for (int j = 1; j <= str.length(); j++) {
                if (i < j) {
                    System.out.println(str.substring(i, j));
                }
            }

        }
    }
}

