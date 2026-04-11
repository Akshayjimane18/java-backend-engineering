package dsAlgo.striverA2Z.sorting;

public class InsertionSort {

    /**
     * Intuition
     * Insertion sort builds a sorted array one element at a time by repeatedly picking the next element and inserting it into its correct position within the already sorted part of the array.
     * <p>
     * Approach
     * In each iteration, select an element from the unsorted part of the array using an outer loop.
     * Place this element in its correct position within the sorted part of the array.
     * Use an inner loop to shift the remaining elements as necessary to accommodate the selected element. This involves shifting the elements by one place until the selected element can be placed at its correct position.
     * Continue this process until the entire array is sorted.
     */

    public static void main(String[] args) {
        int[] nums = {12, 11, 13, 5, 6};
        InsertionSort insertionSort = new InsertionSort();
        int[] sortedArray = insertionSort.insertionSort(nums);
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }

    public int[] insertionSort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int j = i;

            while (j > 0 && nums[j] < nums[j - 1]) {
                int temp = nums[j - 1];
                nums[j - 1] = nums[j];
                nums[j] = temp;
                j--;
            }
        }

        return nums;
    }


}
