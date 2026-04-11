package dsAlgo.striverA2Z.basics.hashing;

import java.util.*;

public class MostFrequentElement {

    public static void main(String[] args) {
        MostFrequentElement mfe = new MostFrequentElement();
        int[] nums = {1, 2, 2, 3, 3, 3};
        int result = mfe.mostFrequentElement(nums);
        System.out.println(result);
    }

    public int mostFrequentElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        int highOccurance = 0;
        int highElement = Integer.MIN_VALUE;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if ((entry.getValue()) > highOccurance || (highOccurance == entry.getValue() && entry.getKey() < highElement)) {
                highOccurance = entry.getValue();
                highElement = entry.getKey();
            }
        }

        return highElement;
    }
}
