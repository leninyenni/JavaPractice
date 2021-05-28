package javaLearning.blocks.staticFlow;

public class Base {
    static int i = 10;
    static {
        methodOne();
        System.out.println("base static block");
    }
    public static void main(String[] args) {
        methodOne();
        System.out.println("base  main");
    }
    public static void methodOne() {
        System.out.println(j);
    }

    static int j = 20;

}
