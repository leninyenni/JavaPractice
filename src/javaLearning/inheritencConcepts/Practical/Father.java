package javaLearning.inheritencConcepts.Practical;

public class Father {
    int a=10;


   public Father()
    {
        System.out.println("I am father");
    }

    public void property()
    {
        System.out.println("Money, Land");
    }

    public void marriage()
    {
        System.out.println("subba lakshmi"); //overridden
    }
}
