package companies.intrvwQustns.Amazon;

import org.apache.commons.compress.utils.Sets;
import org.apache.poi.ss.formula.functions.T;

import java.util.*;

public class NthInPermutatedArray {

    public static <T> Set<T> convertListToSet(List<T> list) {
        // create a set from the List
        return (Set<T>) Sets.newHashSet(list);
    }

    public static List<List<T>> giveListOfPermutations(String givenString, int blocks) {
        Map<Integer, ArrayList> iterableMap = new HashMap<>();
        ArrayList<String> elements = new ArrayList<>();
        int numberOfKeys = 1;
        int count = 0;
        for (int i = 0; i < givenString.length(); i++) {
            elements.add(Character.toString(givenString.charAt(i)));
        }
        System.out.println(elements);
        int counter = 0;
        int key = 1;
        ArrayList<String> sub = new ArrayList<>();
        List<String> list = elements;

        Map<Integer, List> map = new HashMap<>();
        int blockelements = givenString.length()/blocks;
        int numberofblocks = blocks;
        int a = 0;
        int b = blockelements;
        for (int i = 0; i < numberofblocks; i++) {
            System.out.println(list.subList(a, b));
            map.put(i + 1, list.subList(a, b));
            a = a + blockelements;
            b = b + blockelements;
        }

        List<List<T>> itlist = new ArrayList<>();
        for (int i : map.keySet()) {
            itlist.add(map.get(i));
        }
        return itlist;
    }

    public static String convertListToString(List<T> list) {
        String strListString = list.toString();
        strListString =
                strListString.replaceAll(", ", " ").replaceAll("\\[|\\]", "");
        strListString = strListString.replace(" ", "");
        return strListString;
    }

    public static int getNthElement(Set<Integer> set, int rank)
    {
        List<Integer> list = new ArrayList<Integer>(set);
        int value = list.get(rank-1);
        return value;
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String input=null;
        System.out.println("Enter String that you want to split :");
        input =scanner.nextLine();
        System.out.println("enter the count of blocks you want:");
        int count= scanner.nextInt();
        System.out.println("Enter the Nth element you want :");
        int n= scanner.nextInt();
        Set<List<T>> combs = PermutationsOfElementsFromMultipleLists.getCombinations(giveListOfPermutations(input, count));
        Set<Integer> set = new TreeSet<>();
        for (List<T> list : combs) {
            /*            System.out.println(list.toString());*/
            set.add(Integer.parseInt(convertListToString(list)));
        }
        System.out.println("All possible numbers formed from above blocks are:"+set);
        System.out.println("Nth element in the formed collection is :"+getNthElement(set,n));
    }

}
