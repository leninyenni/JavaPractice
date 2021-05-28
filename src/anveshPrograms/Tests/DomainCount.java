package anveshPrograms.Tests;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class DomainCount {
    static ArrayList<String> subDomainList = new ArrayList<>();

    public static void main(String[] args) {
        HashMap<String, Integer> domainCount = new HashMap<>();
        HashMap<String, Integer> subDomainCount = new HashMap<>();
        List<String> domains = Arrays.asList("900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org");
        for (String s : domains) {

            String[] data = s.split(" ");
            // int count =Integer.parseInt(data[0]);
            domainCount.put(data[1], Integer.valueOf(data[0]));
            subDomainList = new ArrayList<>(new LinkedHashSet<>(getSubDomains(data[1])));
            subDomainList.forEach(x -> {
                AtomicInteger count = new AtomicInteger();
                domainCount.forEach((key, value) -> {
                    if (key.contains(x)) {
                        count.addAndGet(value);
                    }
                });
                subDomainCount.put(x, count.get());
            });
            for (int i = 0; i < subDomainList.size(); i++) {
                //String key=domainCount.keySet().c
                if (domainCount.containsKey(subDomainList.get(i))) {

                    // if(domainCount.keySet().toArray()[i].toString().equalsIgnoreCase(subDomainList.get(i))){
                    domainCount.put(subDomainList.get(i), domainCount.get(subDomainList.get(i)) + Integer.valueOf(data[0]));
                    // }
                } else {
                    domainCount.put(subDomainList.get(i), Integer.valueOf(data[0]));
                }

            }
        }
        System.out.println("Sub domain list count : " + subDomainCount);
    }

    static ArrayList<String> getSubDomains(String domain) {
        subDomainList.add(domain);
        String subDomain = domain.substring(domain.indexOf(".") + 1);
        subDomainList.add(subDomain);
        if (subDomain.contains("."))
            getSubDomains(subDomain);
        return subDomainList;
    }

}