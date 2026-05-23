package dsAlgo.striverA2Z.sorting;

public class RecursiveInsertionSort {

    public static void main(String[] args) {
        RecursiveInsertionSort obj = new RecursiveInsertionSort();
        int[] nums = {12, 11, 13, 5, 6};
        System.out.println("Before Sorting : ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        int[] sortedArray = obj.insertionSort(nums);
        System.out.println("After Sorting : ");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }

    public int[] insertionSort(int[] nums) {
        sort(nums, 0, nums.length - 1);

        return nums;
    }

    public void sort(int[] nums, int start, int end) {

        if (start > end) {
            return;
        }

        int j = start;
        while (j > 0 && nums[j] < nums[j - 1]) {

            int temp = nums[j - 1];
            nums[j - 1] = nums[j];
            nums[j] = temp;

            j--;
        }

        sort(nums, start+1, end);




    }
}
