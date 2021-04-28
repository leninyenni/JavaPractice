package javaLearning.ConstructorRelated;

public class ClassTwo {
    int b;
    public static void somex() {
        //one way to access static members directly by using class name
        System.out.println(ClassOne.a);

        //normal way to access variables or methods in other class
        ClassOne classOne= new ClassOne();
        ClassTwo classTwo= new ClassTwo();
        System.out.println(classOne.a);
        classTwo.modifyvariable();
        System.out.println(ClassOne.a);
       // System.out.println(classTwo.b);
    }
    public int modifyvariable()
    {
        ClassOne.a= ClassOne.a + 20;
        //b=ClassOne.a+20;
      return ClassOne.a;
    }

}
