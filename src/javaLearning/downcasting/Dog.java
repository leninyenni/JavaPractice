package javaLearning.downcasting;

public class Dog implements Mammal,Specie{
    @Override
    public void getMe() {
        System.out.println("I am dog");
    }
}
