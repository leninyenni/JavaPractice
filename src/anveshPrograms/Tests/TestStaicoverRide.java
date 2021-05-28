package anveshPrograms.Tests;

public class TestStaicoverRide {
    public static void main(String args[]){
        A.testMethod1();
        B.testMethod1();
    }
}

class A {
    public static void testMethod1(){
        System.out.println("In class A method1");
    }
}

class B extends A {
    public static void testMethod1(){
        System.out.println("In class A method1");
    }
}
