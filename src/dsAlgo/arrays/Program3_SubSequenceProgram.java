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
        int[] arr = {1, 2, 3};
        generate(arr, 0, new ArrayList<>());
    }

    public static class Program2_ThirdLargestElement {
        public static void main(String[] args) throws Exception {
            // your code goes here
            int[] a = {2, 423, 23, 2, 534, 22, 754, 2};

            System.out.println("Second Largest = " + secondLargest(a));

        }

        static int secondLargest(int[] arr) {
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int j : arr) {
                if (j > largest) {
                    secondLargest = largest;
                    largest = j;
                } else if (j > secondLargest) {
                    secondLargest = j;
                }
            }

            return secondLargest;
        }
    }
}
