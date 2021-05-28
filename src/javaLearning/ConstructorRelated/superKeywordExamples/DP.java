package javaLearning.ConstructorRelated.superKeywordExamples;

public class DP extends Programming {
    // Constructor for class DP
    // and here class DP is extending Programming, hence it will call super() by default
    //and hence Programming class constructor gets called, hence the output is Programming
    public DP() {
        // Calling by using // Programming(int i,int j) // from class Programming.
        super(10, 20);
        System.out.println("DP");
    }

    // Parameterized Constructor
    // for class DP
    public DP(int i, int j) {
        System.out.println("DP + +");
    }

    // parameterized Constructor with
    // one parameter
    public DP(int i) {
        System.out.println("DP +");
    }

}

