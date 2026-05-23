    package dsAlgo.striverA2Z.sorting;


    /**
     * Quick Sort is a divide-and-conquer algorithm like Merge Sort. However, unlike Merge Sort, Quick Sort does not use an extra array for sorting (though it uses an auxiliary stack space). This makes Quick Sort slightly better than Merge Sort from a space perspective.
     *
     * This algorithm follows two simple steps repeatedly:
     *
     * Pick a pivot and place it in its correct position in the sorted array.
     * Move smaller elements (i.e., smaller than the pivot) to the left of the pivot and larger ones to the right.
     * To summarize: The main goal is to place the pivot at its final position in each recursion call, where it should be in the final sorted array.
     *
     * Dry Run:
     * Quick Sort
     * Approach:
     * To implement Quick Sort, we will create two functions: quickSort() and partition().
     *
     * quickSort(arr[], low, high)
     * Initial Setup: The low pointer points to the first index, and the high pointer points to the last index of the array.
     * Partitioning: Use the partition() function to get the index where the pivot should be placed after sorting. This index, called the partition index, separates the left and right unsorted subarrays.
     * Recursive Calls: After placing the pivot at the partition index, recursively call quickSort() for the left and right subarrays. The range of the left subarray will be [low to partition index - 1] and the range of the right subarray will be [partition index + 1 to high].
     * Base Case: The recursion continues until the range becomes 1.
     * partition(arr[], low, high)
     * Select pivot (random element) and swap it with the first element.
     * Use pointers i (low) and j (high). Move i forward to find element > pivot, and j backward to find element < pivot. Ensure i <= high - 1 and j >= low + 1.
     * If i < j, swap arr[i] and arr[j].
     * Continue until j < i.
     * Swap pivot (arr[low]) with arr[j] and return j as partition index.
     * This approach ensures that Quick Sort efficiently sorts the array using the divide-and-conquer strategy.*/
    public class QuickSortAlgorithm {

        public static void main(String[] args) {
            QuickSortAlgorithm obj = new QuickSortAlgorithm();
            int[] nums = {10, 7, 8, 9, 1, 5};
            System.out.println("Before Sorting : ");
            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();
            int[] sortedArray = obj.quickSort(nums);
            System.out.println("After Sorting : ");
            for (int num : sortedArray) {
                System.out.print(num + " ");
            }
        }

        public int[] quickSort(int[] nums) {
            qs(nums, 0, nums.length - 1);

            return nums;
        }

        void qs(int[] nums, int low, int high) {

            if (low < high) {

                int partIndex = partIndex(nums, low, high);

                qs(nums, low, partIndex - 1);
                qs(nums, partIndex + 1, high);


            }
        }

        int partIndex(int[] nums, int low, int high) {

            int pivot = nums[low];

            int i = low;
            int j = high;
            while (i < j) {
                while (nums[i] <= pivot && i <= high - 1) {
                    i++;
                }

                while (nums[j] > pivot && i >= low + 1) {
                    j--;
                }

                if (i < j) {
                    swap(nums, i, j);
                }

            }

            swap(nums, low, j);

            return j;
        }

        void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
