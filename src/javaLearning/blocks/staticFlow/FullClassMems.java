package javaLearning.blocks.staticFlow;

public class FullClassMems {
    static int i = 10;


    static {
        methodOne();
        System.out.println("first static block");
    }

    public static void main(String[] args) {
        methodOne();
        System.out.println("main  method");
    }

    public static void methodOne() {
        System.out.println(j);
    }

    static {
        System.out.println("second static block");
    }

    static int j = 20;
}
