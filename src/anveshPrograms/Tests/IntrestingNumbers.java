package anveshPrograms.Tests;

public class IntrestingNumbers {
    public static void main(String[] args) {
        System.out.println(intresting_numbers(1,9));
    }

    static int intresting_numbers(int N1, int N2) {
        int intrestCount = 0;
        for(int i=N1;i<N2;i++){
            int ec=evencount(i);
            int oc=oddcount(i);
            if((oc%2==0)&&(ec%2==1)){
                intrestCount=intrestCount+1;
            }
        }

        return intrestCount;
    }

    static int evencount(int n) {
        int count = 0;
        char[] c = (" " + n).toCharArray();
        for (int j = 0; j < c.length; j++) {
            if (Character.getNumericValue(c[j]) % 2 == 0) {
                count = count + 1;
            }
        }
        return count;
    }

    static int oddcount(int n) {
        int count = 0;
        char[] c = (" " + n).toCharArray();
        for (int j = 0; j < c.length; j++) {
            if (Character.getNumericValue(c[j]) % 2 == 1) {
                count = count + 1;
            }
        }
        return count;
    }
}
