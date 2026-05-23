package dsAlgo.striverA2Z.arrayProgram.easy;

public class Program_11 {

    public static void main(String[] args) {
        Program_11 obj = new Program_11();
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println("Maximum Consecutive Ones in the Array is : " + obj.findMaxConsecutiveOnes(nums));
    }

    public int findMaxConsecutiveOnes(int[] nums) {

        int consecOne = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                temp++;
            } else {
                temp = 0;
            }

            if (temp > consecOne) {
                consecOne = temp;
            }
        }

        return consecOne;
    }
}
