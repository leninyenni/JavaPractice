package companies.intrvwQustns.EPAM;

public class MinMaxWithOutUsingCollections {
    public static void findMinMax(int[] array) {
        if (array == null || array.length < 1)
            return;
        int min = array[0];
        int max = array[0];

        for (int i = 1; i <= array.length - 1; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("min: " + min + "\nmax: " + max);
    }

    public static void main(String[] args) {
        findMinMax(new int[] {10,40,50,20,69,37});
    }
}
