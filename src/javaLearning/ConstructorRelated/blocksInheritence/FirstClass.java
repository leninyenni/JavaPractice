package javaLearning.ConstructorRelated.blocksInheritence;

public class FirstClass extends ThirdClass{
    static {
        System.out.println("First class static block");
    }

    FirstClass() {
        System.out.println("First Class Constructor ");
    }

    FirstClass(int a) {
        System.out.println("First class argumented constructor");
    }
    {
        System.out.println("First class instance block");
    }

    public static void main(String[] args) {
        FirstClass firstClass1= new FirstClass();
       /* FirstClass firstClass2= new FirstClass(10);*/
    }

}
