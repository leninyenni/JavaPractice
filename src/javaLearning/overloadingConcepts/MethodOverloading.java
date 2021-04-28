package javaLearning.overloadingConcepts;

//overloading is known as static/early/compile binding
public class MethodOverloading {
    int b;

    void m1(int a) {
        System.out.println("one arg int method");
    }

    void m1(int a, int b) {
        System.out.println("two arg int method");
    }

    void m1(char ch) {
        System.out.println("char type arg method");
    }

    MethodOverloading(int b) {
        this.b = b;
        System.out.println("one int arg constructor");
    }

    MethodOverloading(char ch) {
        System.out.println("one arg char constructor");
    }

    public static void main(String[] args) {
        new MethodOverloading('a');
        //new MethodOverloading(100);
        /*new MethodOverloading(10).m1(10);*/
        System.out.println(new MethodOverloading(100).b + new MethodOverloading(100).b);// b value taken 100 since object created and passed value 100 to b
        System.out.println(10+20);
        System.out.println("rat" + "cat"); // operator over loading

    }

}
