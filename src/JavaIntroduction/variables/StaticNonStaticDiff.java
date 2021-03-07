package JavaIntroduction.variables;

public class StaticNonStaticDiff {
    //same copy will be given to each Object since static variables are created at once and in a class level
    public static long staticAtr = System.currentTimeMillis();
    //seperate copy will be given to seperate object since instance variables are created at object level
    public long nonStaticAtr = System.currentTimeMillis();

    //For the static variables it is not required to perform initialization explicitly, JVM will
    //always provide default values
    public static int sommerandomstaticvariable;
//For instance or non static variables JVM will not initialize the variable hence the errror you will be seeing
    //line 28 once you uncomment :P
    public int getSommerandominstancevariable;
    public static void main(String[] args) throws InterruptedException {
        StaticNonStaticDiff t1 = new StaticNonStaticDiff();
        Thread.sleep(100);
        //
        StaticNonStaticDiff t2 = new StaticNonStaticDiff();
        StaticNonStaticDiff t3= new StaticNonStaticDiff();
        System.out.println(t1.staticAtr);
        System.out.println(t1.nonStaticAtr);
        System.out.println(t2.staticAtr);
        System.out.println(t2.nonStaticAtr);
        System.out.println(t3.staticAtr);
        System.out.println(t3.nonStaticAtr);
        System.out.println(sommerandomstaticvariable);
        //System.out.println(getSommerandominstancevariable);
    }
}
