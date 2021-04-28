package javaLearning.ConstructorRelated.constructorAdvance;

public class SecondClass {

    SecondClass() {
        System.out.println("Second Class Constructor ");
    }

    SecondClass(int a) {
        System.out.println("Second Class Argumented Constructor");
    }


    /*B b= new B(); recursion being occured since object is being created and since object created variables getting initialized*/


    public static void main(String[] args) {
        SecondClass ob = new SecondClass(25); // when object B was created for Child Class B, automatically Super class constructors get called
        try {
            Class.forName("javaLearning.blocks.blocksInheritence.FirstClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
