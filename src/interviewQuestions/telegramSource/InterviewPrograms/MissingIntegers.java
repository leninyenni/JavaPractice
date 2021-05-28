package interviewQuestions.telegramSource.InterviewPrograms;

public class MissingIntegers {
    static void missingInte(int[] a, int range) {
        int first = 0;
        int second = 0;
        int diff = 0;
        for (int i = 0; i < a.length; i++) {
            first = a[i];
            if (i < a.length - 1) {
                second = a[i + 1];
            }
            if (i == a.length - 1) {
                second = a[a.length - 1];
            }
            diff = second - first;
            for (int j = first + 1; j < second; j++) {
                System.out.println(j);
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 5, 7, 10};
        missingInte(a, 10);
    }
}
