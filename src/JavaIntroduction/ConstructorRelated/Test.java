package JavaIntroduction.ConstructorRelated;

public class Test {

    Test() {
        System.out.println(this); // JavaIntroduction.ConstructorRelated.Test@5caf905d
        System.out.println(this.hashCode()); //1555009629
    }

    public static void main(String[] args) {
        Test t = new Test();
        Child child=new Child();
    }

}
