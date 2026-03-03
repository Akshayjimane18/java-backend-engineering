package dsAlgo.arrays;

import java.util.Arrays;

public class Program7_RemoveDuplicates {

    public static void main(String[] args) {
        int[] a = {1,1,2};
        Program7_RemoveDuplicates obj = new Program7_RemoveDuplicates();
        System.out.println("Remove duplicates from array = " + obj.removeDuplicates(a));

        System.out.println(Arrays.toString(a));
    }
    public int removeDuplicates(int[] nums) {
        int k = 1;
        if(nums.length <=1)
            return nums.length;

        for(int i = 1; i<nums.length; i++){
            if(nums[i]!=nums[i-1]) {
                nums[k++] = nums[i];
            }
        }

        return k;
    }
}
