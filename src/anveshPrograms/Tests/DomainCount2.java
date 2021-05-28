package anveshPrograms.Tests;

import java.util.*;

public class DomainCount2 {


    public static void main(String[] args) throws Exception {


        // Input: ["900 google.mail.com", "50 yahoo.com", "1 intel.mail.com",
        // "5 wiki.org"]
        // Output:
        // ["901 mail.com","50 yahoo.com","900 google.mail.com",
        // "5 wiki.org","5 org","1 intel.mail.com","951 com"]
        String ir[] = new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};


        List<String> inarr = Arrays.asList(ir);
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        System.out.println(inarr);


        for (String str : inarr) {


            int bcnt = Integer.parseInt(str.split(" ")[0]);
            String tstr = str.split(" ")[1];
            String bstr = tstr;
            char ch = '.';
            int cocnt = charOccurance(bstr, ch);
            int mind = bstr.indexOf(".");
            int sind = 0;
            for (int i = 0; i <= cocnt; i++) {


                if (hm.containsKey(bstr)) {
                    hm.put(bstr, hm.get(bstr) + bcnt);
                } else {
                    hm.put(bstr, bcnt);
                }


                bstr = tstr.substring(mind + sind + 1);
                sind = bstr.indexOf(".")+1;
                //sind = sind + 1;
            }
            System.out.println("check" + hm);

        }


        Iterator it = hm.entrySet().iterator();
        ArrayList<String> fr = new ArrayList<String>();


        while (it.hasNext()) {
            Map.Entry par = (Map.Entry) it.next();
            fr.add(par.getValue() + " " + par.getKey());
        }
        System.out.println(fr);
    }


    private static int charOccurance(String bstr, char chr) {
        int count = 0;
        for (int i = 0; i < bstr.length(); i++) {
            if (chr == bstr.charAt(i)) {
                count++;
            }
        }


        return count;
    }


}