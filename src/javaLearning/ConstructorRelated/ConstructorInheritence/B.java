package javaLearning.ConstructorRelated.ConstructorInheritence;

public class B extends A {


    public B(int a) {
        super(a);
        System.out.println("i am from B class");
    }

   /* public B() {

    }*/

    public static void main(String[] args) {
        new B(10);
        //if you create an object then we should have a default constructor declared even though we have default constructor in parent
       //case:2
        //if you declare a default constructor in B, then the default constructor in parent should not be private
        // new B();
    }



}
