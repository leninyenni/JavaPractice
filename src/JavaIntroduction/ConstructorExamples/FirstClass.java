package JavaIntroduction.ConstructorExamples;

public class FirstClass {
   /* static {
        System.out.println("A class static block");
    }*/

    FirstClass() {
        System.out.println("First Class Constructor ");
    }

    FirstClass(int a) {
        System.out.println("First class argumented constructor");
    }

    public static void main(String[] args) {
        FirstClass firstClass1= new FirstClass();
        FirstClass firstClass2= new FirstClass(10);
    }

}
