package companies.intrvwQustns.Oracle.RoundTwo;

import java.util.*;

public class SortHashMapValues {
    public static void main(String[] args) {
//implementing HashMap
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(6, "Tushar");
        hm.put(12, "Ashu");
        hm.put(5, "Zoya");
        hm.put(78, "Yash");
        hm.put(10, "Praveen");
        hm.put(67, "Boby");
        hm.put(1, "Ritesh");
        System.out.println("Before Sorting:");
        Set set = hm.entrySet();
        Iterator<Map.Entry<Integer,String>> iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry map = iterator.next();
            System.out.println("Roll no:  " + map.getKey() + "     Name:   " + map.getValue());
        }
        Map<Integer, String> map = sortValues(hm);
        System.out.println("\n");
        System.out.println("After Sorting:");
        Set<Map.Entry<Integer,String>> set2 = map.entrySet();
        Iterator<Map.Entry<Integer,String>> iterator2 = set2.iterator();
        while (iterator2.hasNext()) {
            Map.Entry me2 = iterator2.next();
            System.out.println("Roll no:  " + me2.getKey() + "     Name:   " + me2.getValue());
        }
    }

    //method to sort values
    private static HashMap sortValues(HashMap map) {
        List<Map.Entry<Integer,String>> list = new LinkedList(map.entrySet());
//Custom Comparator
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
            }
        });
        System.out.println(list);
//copying the sorted list in HashMap to preserve the iteration order
        HashMap sortedHashMap = new LinkedHashMap();
        for (Iterator<Map.Entry<Integer,String>> it = list.iterator(); it.hasNext(); ) {
            Map.Entry entry =  it.next();
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }
        return sortedHashMap;
    }
}
