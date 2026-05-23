package dsAlgo.striverA2Z.arrayProgram.easy;

import java.util.*;

public class Program_4 {

    public static void main(String[] args) {
        Program_4 obj = new Program_4();
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 4, 5};
        System.out.println("Number of Unique Elements in the Array is : " + obj.removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }


        int j = 0;

        for (int val : set) {
            nums[j++] = val;
        }


        return set.size();
    }
}
