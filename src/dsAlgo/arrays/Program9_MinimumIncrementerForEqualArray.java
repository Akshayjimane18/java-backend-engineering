package dsAlgo.arrays;

public class Program9_MinimumIncrementerForEqualArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int k = 2;

        System.out.println("Minimum incrementer for equal array = " + minOps(arr, k));
    }
    static int minOps(int [] arr, int k) {

        // Your code here
        int incrementer = 0;
        int max = Integer.MIN_VALUE;
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }

        for (int j : arr) {

            int a = max - j;


            if (a % k != 0) {
                return -1;
            }

            incrementer += a / k;
        }
        return incrementer;
    }

}
