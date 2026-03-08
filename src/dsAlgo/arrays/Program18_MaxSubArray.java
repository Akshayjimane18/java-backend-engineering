package dsAlgo.arrays;

public class Program18_MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Program18_MaxSubArray obj = new Program18_MaxSubArray();
        System.out.println("Maximum sum of sub array = " + obj.maxSubarraySum(arr));
    }

    int maxSubarraySum(int[] arr) {

        // Stores the result (maximum sum found so far)
        int res = arr[0];

        // Maximum sum of subarray ending at current position
        int maxEnding = arr[0];

        for (int i = 1; i < arr.length; i++) {

            // Either extend the previous subarray or start
            // new from current element
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);

            // Update result if the new subarray sum is larger
            res = Math.max(res, maxEnding);
        }
        return res;
    }
}
