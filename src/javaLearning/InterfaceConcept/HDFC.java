package javaLearning.InterfaceConcept;

public class HDFC implements RBI{
    @Override
    public int getBalance() {
        return 500;
    }

    @Override
    public void withdraw(int amount) {
        /*int bal= getBalance()-amount;
        System.out.println("Remaining balance in HDFC is :"+bal);*/
        System.out.println("hdfc giving 20percent");
    }
}
