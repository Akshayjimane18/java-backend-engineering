package dsAlgo.arrays;

public class Program19_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 4;
        Program19_BinarySearch obj = new Program19_BinarySearch();
        System.out.println("Index of target in array = " + obj.search(arr, target));
    }

    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {

                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

}
