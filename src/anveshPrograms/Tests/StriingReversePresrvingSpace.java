package anveshPrograms.Tests;

import java.io.*;

public class StriingReversePresrvingSpace {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        StringBuilder sb = new StringBuilder(s);

        String revS = new StringBuilder(s.replaceAll(" ", " ")).reverse().toString();

        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (sb.charAt(i) != ' ')
            {
                sb.setCharAt(i, revS.charAt(c));
                c++;
            }
        }

        System.out.println(sb);
    }
}