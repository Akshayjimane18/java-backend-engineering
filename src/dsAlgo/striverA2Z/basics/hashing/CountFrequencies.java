package dsAlgo.striverA2Z.basics.hashing;

import java.util.*;

public class CountFrequencies {

    public static void main(String[] args) {
        CountFrequencies cf = new CountFrequencies();
        int[] nums = {1, 2, 2, 3, 3, 3};
        List<List<Integer>> result = cf.countFrequencies(nums);
        System.out.println(result);
    }

    public List<List<Integer>> countFrequencies(int[] nums) {
        // Your code goes here

        List<List<Integer>> listOfList = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            listOfList.add(Arrays.asList(entry.getKey(), entry.getValue()));
        }

        return listOfList;
    }
}
