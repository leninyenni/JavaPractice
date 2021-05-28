package anveshPrograms.Tests;

public class TotalNumOfCookies {
    public static void main(String[] args) {
       // int n;
       // Scanner sn = new Scanner(System.in);
        //n = sn.nextInt();
        System.out.println(countNoOfCookies(2));
    }

    static int countNoOfCookies(int n) {

        int vcount=0;
        for(int i=n;i>=1;i--){
            vcount=vcount+i;
        }
        return vcount;
    }
}
