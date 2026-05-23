package dsAlgo.striverA2Z.arrayProgram.easy;

public class Program_7 {

    public static void main(String[] args) {
        Program_7 obj = new Program_7();
        int[] nums = {0, 1, 0, 3, 12};
        System.out.println("Array before moving zeroes : ");
        for (int i : nums) {
            System.out.print(i + " ");
        }
        obj.moveZeroes(nums);
        System.out.println("\nArray after moving zeroes : ");
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    public void moveZeroes(int[] nums) {

        int[] temp = new int[nums.length];

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp[count++] = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }

    }
}
