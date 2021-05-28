package anveshPrograms.Tests;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {
    public static void main(String []args){
    List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
    List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
    System.out.println(filtered);

    String str="123";
    List<char[]> l1 = Arrays.asList(str.toCharArray());


    List<Integer> ints1 = Arrays.asList(1,0,0,0,1,0);
    List<Integer> allzeros=ints1.stream().filter(integer->!integer.equals(1)).collect(Collectors.toList());
    List<Integer> allones=ints1.stream().filter(integer->!integer.equals(0)).collect(Collectors.toList());
    //allzeros.addAll(allones);
        allones.addAll(allzeros);
    List<String> strlist=allzeros.stream().map(s->String.valueOf(s)).collect(Collectors.toList());
    String str5=String.join("",strlist);
        System.out.println(str5);

}}
