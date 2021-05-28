package javaLearning.inheritencConcepts.Practical;

public class Daughter extends Father {


    public void marriage()
    {
        System.out.println("Pawan Kalyan"); //over riding
    }

    public static void main(String[] args) {
        Daughter daughter= new Daughter();
        daughter.property();
        daughter.marriage();
    }
}
