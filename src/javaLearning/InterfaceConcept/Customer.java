package javaLearning.InterfaceConcept;

public class Customer {

    public static void main(String[] args) {
        RBI icici= new ICICI();
        System.out.println(icici.getBalance());
        icici.withdraw(900);

        RBI sbi= new SBI();
        System.out.println(sbi.getBalance());
        sbi.withdraw(800);

        RBI hdfc= new HDFC();
        System.out.println(hdfc.getBalance());
        hdfc.withdraw(200);
    }
}
