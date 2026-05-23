package dsAlgo.striverA2Z.arrayProgram.easy;

import java.util.HashMap;

public class Program_12 {

    public static void main(String[] args) {
        Program_12 obj = new Program_12();
        int[] nums = {2, 2, 1};
        System.out.println("Single Number in the Array is : " + obj.singleNumber(nums));
    }

    public int singleNumber(int[] nums) {

        /* Map to store the elements
        and their frequencies */
        HashMap<Integer, Integer> mpp = new HashMap<>();

        // Iterate on the array
        for (int num : nums) {
            mpp.put(num, mpp.getOrDefault(num, 0) + 1); //Update the map
        }

        //Iterate on the map
        for (int key : mpp.keySet()) {
            // If frequency is 1
            if (mpp.get(key) == 1) {
                // Return the element
                return key;
            }
        }

        /* Return -1, if there is no
        number having frequency 1 */
        return -1;
    }
}
