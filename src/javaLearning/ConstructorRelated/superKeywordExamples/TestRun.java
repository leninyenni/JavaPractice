package javaLearning.ConstructorRelated.superKeywordExamples;

public class TestRun {
    public static void main(String[] args)
    {
        // Ceating obj for class DP
       // DP obj = new DP();

        //here when it goes to single argumented constructor of DP
        //as we haven't mentioned any line, it call super() by default and hence it executes parent class default constructor
       // DP obj2= new DP(10);
        DP obj2= new DP(10,30);
    }
}
