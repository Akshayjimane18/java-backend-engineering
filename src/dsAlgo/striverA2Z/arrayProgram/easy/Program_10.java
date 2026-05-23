package dsAlgo.striverA2Z.arrayProgram.easy;

public class Program_10 {

    public static void main(String[] args) {
        Program_10 obj = new Program_10();
        int[] nums = {0, 1, 2, 4, 5};
        System.out.println("Missing Number in the Array is : " + obj.missingNumber(nums));
    }

    public int missingNumber(int[] nums) {
        for (int i = 0; i <= nums.length; i++) {

            int flag = 0;

            for (int j = 0; j < nums.length; j++) {

                if (nums[j] == i) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) return i;
        }

        return -1;
    }
}
