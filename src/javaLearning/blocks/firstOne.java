package javaLearning.blocks;

public class firstOne {

    int a = 10;
    static int b = 20;
    int c = 30;

    public void instancMethod() {
        System.out.println(a);
        System.out.println(b);
        System.out.println("i am instance method");
    }

    public int methodWithReturnType() {
        System.out.println(b);
        return 10;
    }

    public static void staticMethod() {
        firstOne f1 = new firstOne();
        System.out.println(f1.c);
        System.out.println("i am static method");
    }

    public void methodWithArguments(String str) {
        System.out.println("this method will take argument as :" + str);
    }

    public static void main(String[] args) {
        firstOne f = new firstOne();
        f.instancMethod();
        staticMethod();
       int c= f.methodWithReturnType();
    }

}
