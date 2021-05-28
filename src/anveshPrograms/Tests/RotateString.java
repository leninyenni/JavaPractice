package anveshPrograms.Tests;

public class RotateString {
    public static void main(String[] s) {
        String a = "Anvesh";
        String rotated = "";
        int n = 3;
        rotated = a.substring(n) + a.substring(0, n);

        System.out.println(rotated);

    }
}
