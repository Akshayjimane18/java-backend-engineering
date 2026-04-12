package dsAlgo.striverA2Z.sorting;

public class RecursiveBubbleSort {

    public static void main(String[] args) {
        RecursiveBubbleSort obj = new RecursiveBubbleSort();
        int[] nums = {5, 1, 4, 2, 8};
        System.out.println("Before Sorting : ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        int[] sortedArray = obj.bubbleSort(nums);
        System.out.println("After Sorting : ");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }

    public int[] bubbleSort(int[] nums) {
        int n = nums.length - 1;

        sort(nums, 0, n);

        return nums;
    }

    void sort(int[] nums, int left, int right) {

        if (left > right)
            return;

        int low = left;

        while (low < right) {

            if (nums[low] > nums[right]) {
                int temp = nums[low];
                nums[low] = nums[right];
                nums[right] = temp;
            }

            low++;
        }

        sort(nums, left, right - 1);
    }
}
