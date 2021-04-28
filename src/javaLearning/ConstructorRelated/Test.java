package javaLearning.ConstructorRelated;


import javaLearning.ConstructorRelated.ConstructorInheritence.Child;

public class Test {

    Test() {
        System.out.println(this); // javaLearning.ConstructorRelated.Test@5caf905d
        System.out.println(this.hashCode()); //1555009629
    }

    public static void main(String[] args) {
        Test t = new Test();
        //small loop hole here-if you didn't declare constructor as public then constructor will be default
        //so we can't create object for the constructor outside the packe when constructor inside Child class is declared "public"
        Child child=new Child();
    }

}
