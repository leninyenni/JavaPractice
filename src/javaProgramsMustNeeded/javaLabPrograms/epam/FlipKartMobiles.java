package javaProgramsMustNeeded.javaLabPrograms.epam;
//how to get list of mobiles in mobile page
//My own question
//How to extract numbers of results i.e 24 from below string
//Showing 1 – 24 of 11,609 results for

public class FlipKartMobiles {
    //xpath of mobiles  //div[@id='container']/div/div[3]/div/div[2]/div

    public static void main(String[] args) {
        String str = "Showing 1 – 24 of 11,609 results for ";
        String[] strings = str.split(" ");
        System.out.println(strings[3]);
        System.out.println(strings[5]);
    }

}
