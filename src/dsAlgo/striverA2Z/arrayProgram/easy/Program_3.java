package dsAlgo.striverA2Z.arrayProgram.easy;

import java.util.ArrayList;

public class Program_3 {

    public static void main(String[] args) {
        Program_3 obj = new Program_3();
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        System.out.println("Is the Array Sorted : " + obj.isSorted(nums));
    }

    public boolean isSorted(ArrayList<Integer> nums) {
        //your code goes here

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
