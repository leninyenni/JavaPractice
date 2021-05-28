package javaLearning.inheritencConcepts.Practical;

public class Son extends Father {

    public Son() {
        System.out.println("I am son");

    }

    public void marriage() {
        System.out.println("trisha"); //over riding method
    }

    public static void main(String[] args) {
       /* Son son= new Son();
        son.property();
        son.marriage();*/
        Father father1 = new Son();
        father1.marriage();


    }
}
