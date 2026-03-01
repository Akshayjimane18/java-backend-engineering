package dsAlgo.arrays;

import java.util.Arrays;
import java.util.Random;

public class Program5_ReverseGroupArray {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        int[] a = {2, 423, 23, 2, 534, 22, 754, 2};

        System.out.println("Reversed array = " + Arrays.toString(reversedArray(a, new Random().nextInt((a.length - 1) + 1) + 1)));

    }

    static int[] reversedArray(int[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);

            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            i += k - 1; // Move to the next group
        }
        return arr;
    }
}
