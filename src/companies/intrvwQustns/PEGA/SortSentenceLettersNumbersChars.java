package companies.intrvwQustns.PEGA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SortSentenceLettersNumbersChars {
    public static void main(String[] args) {
        String text = "##5 Times Dish@ P@tani kept the heat factor ON in slip dresses and look like an absolute bombshell";
        ArrayList<Character> listOfSpecialChars = new ArrayList<>();
        ArrayList<Character> listOfNumbers = new ArrayList<>();
        ArrayList<Character> listOfUpperCase = new ArrayList<>();
        ArrayList<Character> listOfLowerCase = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                listOfNumbers.add(text.charAt(i));
            } else if (Character.isSpaceChar(text.charAt(i))) {
                listOfSpecialChars.add(text.charAt(i));
            } else if (Character.isUpperCase(text.charAt(i))) {
                listOfSpecialChars.add(text.charAt(i));
            } else if (Character.isUpperCase(text.charAt(i))) {
                listOfLowerCase.add(text.charAt(i));
            } else {
                listOfSpecialChars.add(text.charAt(i));
            }
        }
        System.out.println(listOfNumbers);
        HashSet<Character> sortedNumbers = new HashSet<>(listOfNumbers);
        HashSet<Character> sortedUpperCases = new HashSet<>(listOfUpperCase);
        HashSet<Character> sortedLowerCases = new HashSet<>(listOfLowerCase);
        HashSet<Character> sortedChars= new HashSet<>(listOfSpecialChars);


        List<Character> MainCollection=new ArrayList<>();
        MainCollection.addAll(sortedNumbers);
        MainCollection.addAll(sortedUpperCases);
        MainCollection.addAll(sortedLowerCases);
        MainCollection.addAll(sortedChars);
        System.out.println(MainCollection);
    }
}
