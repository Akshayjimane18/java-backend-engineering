package dsAlgo.arrays;

public class Program12_SumOfSubArrays {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        Program12_SumOfSubArrays obj = new Program12_SumOfSubArrays();
        System.out.println("Sum of all sub arrays = " + obj.subarraySum(arr));
    }

    public int subarraySum(int[] arr) {
        // code here
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {


            sum += (arr[i] * (i + 1) * (arr.length - i));

        }

        return sum;
    }
}
