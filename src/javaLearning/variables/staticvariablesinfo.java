package javaLearning.variables;

public class staticvariablesinfo {
    int x = 10;
    static int y = 20;

    public static void main(String[] args) {
        staticvariablesinfo t1 = new staticvariablesinfo();
        t1.x = 888;
        t1.y = 999;

        staticvariablesinfo t2 = new staticvariablesinfo();
        t2.y=1000;
        System.out.println(t2.x + "----" + t2.y);//10----999
    }

}
