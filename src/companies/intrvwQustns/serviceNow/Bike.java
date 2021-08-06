package companies.intrvwQustns.serviceNow;

public class Bike {
    int speedLimit = 100;

    public void run() {
        System.out.println("i am from bike");
    }
}

class Honda extends Bike {
    //variables are not polymorphic
    int speedLimit = 150;

    public void run() {
        System.out.println("i am from honda");
    }

    public static void main(String[] args) {
        Bike bike = new Honda();
        System.out.println(bike.speedLimit);
        bike.run();
        try {
            int a = 1 / 0;
            System.out.println("a = " + a);
            int[] array = new int[5];
            System.out.println(array[6]);
        }
       /* catch (ArithmeticException ex) {
            System.out.println("this is form Arithmetic");
        }*/
        catch (ArrayIndexOutOfBoundsException ar)
        {
            System.out.println("Index out of bounds exception");
        }
        catch (ArithmeticException ex) {
            System.out.println("this is form Arithmetic");
        }
        catch (Exception e) {
            System.out.println("this is from Exception");
        }
    }
}
