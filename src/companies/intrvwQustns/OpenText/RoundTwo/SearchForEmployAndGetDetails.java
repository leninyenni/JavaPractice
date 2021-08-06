package companies.intrvwQustns.OpenText.RoundTwo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SearchForEmployAndGetDetails {
    public static void main(String[] args) {
        Map<Integer,Employ> employData= new HashMap<Integer,Employ>();
        employData.put(1,new Employ(101,"rahul"));
        employData.put(2,new Employ(102,"sachin"));
        employData.put(3,new Employ(103,"kohli"));
        employData.put(4,new Employ(104,"rohit"));
       // System.out.println(employData);
        Set<Map.Entry<Integer,Employ>> entries= employData.entrySet();

       Iterator<Map.Entry<Integer,Employ>> iterator= entries.iterator();

       /*while (iterator.hasNext())
       {
           System.out.println(iterator.next().getKey()+"--"+iterator.next().getValue());
       }*/
        employData.values().stream().filter(employ -> employ.name.equals("sachin")).forEach(System.out::println);

    }
}
