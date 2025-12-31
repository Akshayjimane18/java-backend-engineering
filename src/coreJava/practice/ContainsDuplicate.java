package coreJava.practice;

import java.util.ArrayList;
import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> uniques = new HashSet<>();
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (uniques.contains(nums[i])) {
                return true;
            }
            uniques.add(nums[i]);
        }
        return false;
    }

    public static void main (String[] args) {

        int[] nums = { 1,1,2,3,4,5,6,};


        System.out.println(containsDuplicate(nums));
    }
}
