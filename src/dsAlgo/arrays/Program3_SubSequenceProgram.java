package dsAlgo.arrays;

import java.util.*;

public class Program3_SubSequenceProgram {

    static void generate(int[] arr, int index, List<Integer> current) {

        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        // Choice 1: Include
        current.add(arr[index]);
        generate(arr, index + 1, current);

        // Choice 2: Exclude
        current.remove(current.size() - 1);
        generate(arr, index + 1, current);
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        int sumTotal=3;

        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());

        for(int num:numbers)
        {
            int size = list.size();
            for(int i=0 ; i < size ; i++) {
                List<Integer> list1 = new ArrayList<>(list.get(i));
                list1.add(num);
                list.add(list1);
            }
        }
        System.out.println("Subset "+list);
        for( List<Integer>AL : list){
            int sum=0;
            for(int i : AL){
                sum+=i;
            }
            if(sum==sumTotal){
                System.out.println(AL);
            }
        }
    }
}
