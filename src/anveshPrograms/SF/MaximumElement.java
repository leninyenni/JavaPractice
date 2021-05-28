package anveshPrograms.SF;

public class MaximumElement {
    public static void main(String [] args){
        int [] a= new int[]{4,7,9,2};
       System.out.println(getSecondLargest(a));
    }
    public static int getSecondLargest(int [] a){
        int first=0;
        int second=0;
            for(int i=0;i<a.length;i++) {
                if (a[i] > first) {
                    second = first;
                    first = a[i];

                }
                else{

                }

            }

      return second;
    }
}
