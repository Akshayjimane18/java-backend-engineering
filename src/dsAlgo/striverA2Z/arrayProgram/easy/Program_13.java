package dsAlgo.striverA2Z.arrayProgram.easy;

import java.util.*;

public class Program_13 {

    public static void main(String[] args) {
        Program_13 obj = new Program_13();
        int[] nums = {1, -1, 5, -2, 3};
        int k = 3;
        System.out.println("Length of the longest subarray with sum k is : " + obj.longestSubarray(nums, k));
    }

    public int longestSubarray(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            // Entire array from 0 to i
            if (sum == k) {
                maxLength = i + 1;
            }

            // Remaining part check
            int remaining = sum - k;

            if (map.containsKey(remaining)) {

                int length = i - map.get(remaining);

                maxLength = Math.max(maxLength, length);
            }

            // Store first occurrence only
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLength;
    }
}
