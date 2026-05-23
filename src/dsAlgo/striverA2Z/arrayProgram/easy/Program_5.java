package dsAlgo.striverA2Z.arrayProgram.easy;

public class Program_5 {
    public static void main(String[] args) {
        Program_5 obj = new Program_5();
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println("Array before Rotation : ");
        for (int i : nums) {
            System.out.print(i + " ");
        }
        obj.rotateArrayByOne(nums);
        System.out.println("\nArray after Rotation : ");
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    public void rotateArrayByOne(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {

            int temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;
        }

    }
}
