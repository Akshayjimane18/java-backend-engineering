package dsAlgo.striverA2Z.arrayProgram.easy;

public class Program_8 {

    public static void main(String[] args) {
        Program_8 obj = new Program_8();
        int[] nums = {1, 2, 3, 4, 5};
        int target = 3;
        System.out.println("Element " + target + " is present at index : " + obj.linearSearch(nums, target));
    }

    public int linearSearch(int nums[], int target) {
        //Your code goes here

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
