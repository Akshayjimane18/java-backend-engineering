package dsAlgo.arrays;

import java.util.Arrays;

public class Program6_RotateArray {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        int[] a = {1, 2, 3, 4, 5, 6};
        int rotation = 3;

        System.out.println("Rotate array = " + Arrays.toString(rotateArray(a, rotation)));

    }

    static int[] rotateArray(int[] arr, int rotations) {
        for (int i = 1; i <= rotations; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

        return arr;
    }
}
