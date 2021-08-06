package interviewQuestions.telegramSource.JavaExercises;

public class ReverseANumberWithOutStringConversion {
    public static void main(String[] args) {
        reverse(16000000);
    }

    private static void reverse(int num) {
        int r = -1;
        while (true) {
            r = (num) % 10;
            if (r != 0) {
                break;
            }
            System.out.print(0);
            num = num / 10;

        }
        System.out.println(num);

    }

}
