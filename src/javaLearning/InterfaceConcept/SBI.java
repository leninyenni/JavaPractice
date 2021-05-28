package javaLearning.InterfaceConcept;

public class SBI implements RBI{
    //this is overriding method in RBI
    @Override
    public int getBalance() {
        return 1000;
    }

    @Override
    public void withdraw(int amount) {
       /* int bal= getBalance()-amount;
        System.out.println("Remaining balance in SBI is :"+bal);*/
        System.out.println("sbi giving  0 percent");
    }
}
