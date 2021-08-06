package companies.intrvwQustns.OpenText;

public class DiagnolSummation {

    public static void main(String[] args) {
        int[][] array = { {2, 13, 5,5},{7, 8,9, 8},{3,10, 12, 1},{23,20, 42, 15}};
        int d1=0;
        int d2=0;
        for (int i=0;i< array.length;i++)
        {
            for (int j=0;j<array.length;j++)
            {
                if (i==j)
                {
                    d1= d1+array[i][j];
                }
            }
        }
        for (int i=0;i<array.length;i++)
        {
            for (int j=array.length-1;j>=0;j--)
            {
                while (i< array.length && j>=0)
                {
                    d2=d2+ array[i][j];
                    i++;
                    j--;
                }
            }
        }
        System.out.println(Math.abs(d1-d2));
    }
}
