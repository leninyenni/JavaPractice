package javaLearning.ConstructorRelated.thisKeyword;

public class ThisKeyWord {
    static int a;
    int b;
    int c;

    void values(int x, int y) {
        this.a = x;
        this.b = y;
    }

    void value(int z) {
        this.c = z;

    }
    void add() {
        System.out.println(a + b);
    }

    void mul() {
        System.out.println(a * b);
    }

    void div()
    {
        System.out.println(c-100);
    }

    public static void main(String[] args) {
        ThisKeyWord t = new ThisKeyWord();
        t.values(100, 200);
        t.add();
        t.mul();
        t.value(550);
        t.div();

    }
}
