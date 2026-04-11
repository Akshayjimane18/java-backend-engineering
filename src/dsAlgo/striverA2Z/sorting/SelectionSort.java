package dsAlgo.striverA2Z.sorting;

/* *
Intuition
The selection sort algorithm sorts an array by repeatedly finding the minimum element from the unsorted part and putting it at the beginning. The largest element will end up at the last index of the array.

Approach
Select the starting index of the unsorted part using a loop with i from 0 to n-1.
Find the smallest element in the range from i to n-1 using an inner loop.
Swap this smallest element with the element at index i.
Repeat the process for the next starting index.
* */
public class SelectionSort {

    public static void main(String[] args) {
        int[] nums = {64, 25, 12, 22, 11};
        SelectionSort selectionSort = new SelectionSort();
        int[] sortedArray = selectionSort.selectionSort(nums);
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }

    int temp = 0;

    public int[] selectionSort(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return nums;

    }
}
