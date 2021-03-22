package JavaIntroduction.encapsulation;

public class Parent {
    private int bal;


    public int getBal() {
        return bal;
    }

    public void setBal(int bal) {
        this.bal = bal;
    }

    public Child getCc()
    {
        return cc;
    }

    public void setCc(Child child)
    {
        this.cc=child;
    }

    private Parent pp;
    private Child cc;

    public Parent getpp() {
        return pp;
    }

    public void setpp(Parent pp) {
        this.pp = pp;
    }



}
