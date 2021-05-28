package javaLearning.downcasting;

public class Verif {
    public static void main(String[] args) {
        Mammal d= new Dog();
        Mammal c= new Cat();

        Snake s= new Snake();
        //in below Dog class is implementing Specie where as Mammal and Specie has no relation
        //means run time object type of d must be same or derived type of Specie
        Specie m = (Specie) d;
        m.getMe();


    }


}
