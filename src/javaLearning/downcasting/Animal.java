package javaLearning.downcasting;

public class Animal {
}

class Dog3 extends Animal {
    static void method(Animal a) {
        if (a instanceof Dog3) {
            Dog3 d = (Dog3) a;//downcasting
            System.out.println("ok downcasting performed");
        }
    }

    public static void main(String[] args) {
        Animal a = new Dog3();
        Dog3.method(a);
    }
}

class Dog4 extends Animal {
    static void method(Animal a) {
        Dog3 d = (Dog3) a;//downcasting
        System.out.println("ok downcasting performed");

    }

    public static void main(String[] args) {
        Animal a = new Dog3();
        Dog4.method(a);
    }


}

class Dog5 extends Animal {
    static void method(Animal a) {
        Dog5 d = (Dog5) a;//downcasting
        System.out.println("ok downcasting performed");

    }

    public static void main(String[] args) {
        Animal a = new Animal();
        Dog5.method(a);
    }
}



