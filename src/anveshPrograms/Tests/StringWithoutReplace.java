package anveshPrograms.Tests;

public class StringWithoutReplace {
    public static void main(String args[]){
        String str="The Haunting of Hill House!";
        String actual="Hill";
        int index=str.indexOf("Hill");
        String rep="cal";
        String res= str.substring(0,index+actual.length())+rep+str.substring(index+1);

        System.out.println(res);


    }
}
