package javaLearning.InterfaceConcept;

public class ICICI implements RBI{
    @Override
    public int getBalance() {
        return 1500;
    }

    @Override
    public void withdraw(int amount) {
        /*int bal= getBalance()-amount;
        System.out.println("Remaining balance in ICICI is :"+bal);*/
        System.out.println("icici giving 30percent");
    }
}
