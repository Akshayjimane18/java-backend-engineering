package dsAlgo.striverA2Z.arrayProgram.easy;

public class Program_2 {

    public int secondLargestElement(int[] nums) {

        int largestElement = Integer.MIN_VALUE;
        int secondLargestElement = Integer.MIN_VALUE;

        if (nums.length <= 1) {
            return -1;
        }

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > largestElement) {

                secondLargestElement = largestElement;
                largestElement = nums[i];

            } else if (nums[i] > secondLargestElement
                    && nums[i] != largestElement) {

                secondLargestElement = nums[i];
            }
        }

        return secondLargestElement == Integer.MIN_VALUE
                ? -1
                : secondLargestElement;
    }

    public static void main(String[] args) {
        Program_2 obj = new Program_2();
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println("Second Largest Element in the Array is : " + obj.secondLargestElement(nums));
    }
}
