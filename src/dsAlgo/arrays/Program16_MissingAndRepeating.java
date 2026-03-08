package dsAlgo.arrays;

import java.util.ArrayList;

public class Program16_MissingAndRepeating {
    public static void main(String[] args) {
        int[] arr = {3, 1, 3};
        Program16_MissingAndRepeating obj = new Program16_MissingAndRepeating();
        System.out.println("Missing and repeating number in array = " + obj.findTwoElement(arr));
    }

    ArrayList<Integer> findTwoElement(int[] arr) {
        int n = arr.length;
        int repeating = -1;

        // Traverse the array and mark visited indices
        // by negating the value at index arr[i] - 1
        for (int i = 0; i < n; i++) {
            int val = Math.abs(arr[i]);

            // If the value at index val - 1 is already negative
            // it means we've seen this value before
            if (arr[val - 1] > 0) {
                arr[val - 1] = -arr[val - 1];
            } else {
                // If it's already negative, this value is the repeating one
                repeating = val;
            }
        }

        int missing = -1;

        // After marking, the index with a positive value
        // corresponds to the missing number
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                missing = i + 1;
                break;
            }
        }

        // Return result: first repeating, then missing
        ArrayList<Integer> result = new ArrayList<>();
        result.add(repeating);
        result.add(missing);
        return result;
    }

}
