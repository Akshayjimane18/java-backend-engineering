package dsAlgo.striverA2Z.arrayProgram.easy;

import java.util.*;

public class Program_9 {

    public static void main(String[] args) {
        Program_9 obj = new Program_9();
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {4, 5, 6, 7, 8};
        System.out.println("Union of the two Arrays is : ");
        int[] union = obj.unionArray(nums1, nums2);
        for (int i : union) {
            System.out.print(i + " ");
        }
    }

    public int[] unionArray(int[] nums1, int[] nums2) {

        Set<Integer> set = new TreeSet<>();

        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            set.add(num);
        }

        int[] union = new int[set.size()];
        int index = 0;
        for (int num : set) {
            union[index++] = num;
        }

        return union;


    }
}
