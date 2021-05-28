package javaLearning.InterfaceConcept;

public class CITI implements RBI{
    @Override
    public int getBalance() {
        return 2000;
    }

    @Override
    public void withdraw(int amount) {
    }
}
