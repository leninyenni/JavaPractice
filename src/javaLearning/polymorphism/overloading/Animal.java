package javaLearning.polymorphism.overloading;

public class Animal {
}

class Monkey extends Animal {
}

class  Test
{
    public void methodOne(Animal a)
    {
        System.out.println("Animal version");
    }
    public void methodOne(Monkey m)
    {
        System.out.println("Monkey version");
    }

    public static void main(String[] args) {
        Test t= new Test();
        Animal a= new Animal();
        Monkey m = new Monkey();
        t.methodOne(a);
        t.methodOne(m);
        Animal a1= new Monkey();
        //In overloading method resolution is always based on reference type and runtime object
        //won't play any role in overloading.
        t.methodOne(a1);
    }

}