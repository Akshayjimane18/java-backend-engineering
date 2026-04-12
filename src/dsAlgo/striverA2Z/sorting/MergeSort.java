package dsAlgo.striverA2Z.sorting;

import java.util.*;

/**
 * Intuition:
 * Merge Sort is a powerful sorting algorithm that follows the divide-and-conquer approach. The array is divided into two equal halves until each sub-array contains only one element. Each pair of smaller sorted arrays is then merged into a larger sorted array.
 * <p>
 * The algorithm consists of two main functions:
 * <p>
 * merge():This function merges the two halves of the array, assuming both parts are already sorted.
 * mergeSort():This function divides the array into 2 parts: low to mid and mid+1 to high where, low is the leftmost index of the array, high is the rightmost index of the array, and mid is the middle index of the array.
 * By repeating these steps recursively, Merge Sort efficiently sorts the entire array.
 */

public class MergeSort {

    public int[] mergeSort(int[] nums) {
        int n = nums.length;

        devide(nums, 0, n - 1);

        return nums;
    }

    void devide(int[] nums, int left, int right) {

        if (left >= right) {
            return;
        }

        int mid = (left + right) / 2;

        devide(nums, left, mid);
        devide(nums, mid + 1, right);

        sort(nums, left, right, mid);

    }

    void sort(int[] nums, int left, int right, int mid) {

        List<Integer> temp = new ArrayList<>();

        int low = left;
        int high = mid + 1;

        while (low <= mid && high <= right) {

            if (nums[low] <= nums[high]) {
                temp.add(nums[low]);
                low++;
            } else {
                temp.add(nums[high]);
                high++;
            }
        }

        while (low <= mid) {
            temp.add(nums[low]);
            low++;
        }

        while (high <= right) {
            temp.add(nums[high]);
            high++;
        }

        for (int i = left; i <= right; i++) {
            nums[i] = temp.get(i - left);
        }


    }

    public static void main(String[] args) {
        int[] arr = {9, 4, 7, 6, 3, 1, 5};
        int n = arr.length;

        System.out.println("Before Sorting Array: ");
        for (int j : arr) System.out.print(j + " ");
        System.out.println();

        // Create an instance of the Solution class
        MergeSort sol = new MergeSort();
        // Function call to sort the array
        int[] sortedArr = sol.mergeSort(arr);

        System.out.println("After Sorting Array: ");
        for (int i = 0; i < n; i++)
            System.out.print(sortedArr[i] + " ");
        System.out.println();
    }
}
