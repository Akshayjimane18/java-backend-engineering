package dsAlgo.striverA2Z.arrayProgram.easy;

public class Program_6 {

    public static void main(String[] args) {
        Program_6 obj = new Program_6();
        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;
        System.out.println("Array before Rotation : ");
        for (int i : nums) {
            System.out.print(i + " ");
        }
        obj.rotateArray(nums, k);
        System.out.println("\nArray after Rotation : ");
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    public void rotateArray(int[] nums, int k) {
        int n = nums.length; // Size of array
        k = k % n; // To avoid unnecessary rotations

        int[] temp = new int[k];

        // Store first k elements in a temporary array
        for (int i = 0; i < k; i++) {
            temp[i] = nums[i];
        }

        // Shift n-k elements of given array to the front
        for (int i = k; i < n; i++) {
            nums[i - k] = nums[i];
        }

        // Copy back the k elements at the end
        for (int i = 0; i < k; i++) {
            nums[n - k + i] = temp[i];
        }
    }
}
