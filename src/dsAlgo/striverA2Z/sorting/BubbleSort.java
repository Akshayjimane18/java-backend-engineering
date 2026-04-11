package dsAlgo.striverA2Z.sorting;

public class BubbleSort {

    /**
     * Intuition
     * The bubble sort algorithm sorts an array by repeatedly swapping adjacent elements if they are in the wrong order. The largest elements "bubble" to the end of the array with each pass.
     * <p>
     * Approach
     * Run a loop i from n-1 to 0.
     * Run a nested loop from j from 0 to i-1.
     * If arr[j] > arr[j+1], swap them.
     * Continue until the array is sorted.
     * Note: Here, after each iteration, the array becomes sorted up to the last index of the range. That is why the last index of the range decreases by 1 after each iteration. This decrement is managed by the outer loop, where the last index is represented by the variable i. The inner loop (variable j) helps to push the maximum element of the range [0...i] to the last index (i.e., index i).
     */
    public static void main(String[] args) {
        int[] nums = {64, 34, 25, 12, 22, 11, 90};
        BubbleSort bubbleSort = new BubbleSort();
        int[] sortedArray = bubbleSort.bubbleSort(nums);
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }

    public int[] bubbleSort(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        return nums;
    }
}
