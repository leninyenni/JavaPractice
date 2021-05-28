package javaLearning.ConstructorRelated.ConstructorOverloading;

public class constructorExample {

   public constructorExample()
    {
        System.out.println("this is default constructor ");
    }

    public constructorExample(int a)
    {
        System.out.println("single argumented int cons");
    }
    public constructorExample(int a,int b)
    {
        System.out.println("two argumented int cons");
    }
    public constructorExample(int a,int b, int c)
    {
        System.out.println("three argumented int cons");
    }

    public constructorExample(String str)
    {
        System.out.println("single argumented string cons");
    }

    public constructorExample(String str, int roll)
    {
        System.out.println("Hello "+str+ " your roll number is : "+ roll);
    }

    public static void main(String[] args) {
       constructorExample c1= new constructorExample("rahul");
       constructorExample c2= new constructorExample("rahul", 1);
       constructorExample c3= new constructorExample(10,20);
       constructorExample c5= new constructorExample(10,20,30);
       constructorExample c4= new constructorExample();

    }







}
