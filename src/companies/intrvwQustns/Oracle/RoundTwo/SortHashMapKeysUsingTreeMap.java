package companies.intrvwQustns.Oracle.RoundTwo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMapKeysUsingTreeMap {
    public static void main(String args[]) {
//implementation of HashMap
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
//addding keys and values to HashMap
        hm.put(23, "Yash");
        hm.put(17, "Arun");
        hm.put(15, "Swarit");
        hm.put(9, "Neelesh");
        Iterator<Integer> it = hm.keySet().iterator();
        System.out.println("Before Sorting");
        while (it.hasNext()) {
            int key = (int) it.next();
            System.out.println("Roll no:  " + key + "     name:   " + hm.get(key));
        }
        System.out.println("\n");
        Map<Integer, String> map = new HashMap<Integer, String>();
        System.out.println("After Sorting");
//using TreeMap constructor to sort the HashMap
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>(hm);
        System.out.println(tm);
       /* Iterator itr = tm.keySet().iterator();
        while (itr.hasNext()) {
            int key = (int) itr.next();
            System.out.println("Roll no:  " + key + "     name:   " + hm.get(key));
        }*/
    }
}
