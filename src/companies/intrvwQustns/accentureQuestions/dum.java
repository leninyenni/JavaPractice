package companies.intrvwQustns.accentureQuestions;

public class dum {

    int a;
    double d;

    static int c;
    static double e;

    public static void main(String[] args) {

        int i;// it will not give error
        dum dum= new dum();
        System.out.println(dum.a);
        System.out.println(dum.d);
        System.out.println(c);
        System.out.println(e);
        //System.out.println(i); it will give error here why means compiler don't know what to print
    }
}
