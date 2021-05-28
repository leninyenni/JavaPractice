package anveshPrograms.Tests;

public class Power {
    public int isPower(int A) {
        int ispower = 0;
        for (int i = A; i > 0; i--) {
            for (int j = A; j > 0; j--) {
                if((i*j==A)&&i>1&&j>1&&i==j){
                    System.out.println("i * j"+ i +"* "+j);
                    ispower= 1;
                    break;
                }
            }

        }
        return ispower;
    }
    public static void main(String args[]){
        Power p1=new Power();
        System.out.println(p1.isPower(225));
    }
}