package javaLearning.blocks.staticFlow;

public class Derived extends Base {
    static int x = 100;

    static {
        methodTwo();
        System.out.println("derived first static block");
    }

    public static void main(String[] args) {
        methodTwo();
        System.out.println("derived main");
    }

    public static void methodTwo() {
        System.out.println(y);
    }

    static {
        System.out.println("derived second static block");
    }

    static int y = 200;

}
