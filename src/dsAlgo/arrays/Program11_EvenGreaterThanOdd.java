package dsAlgo.arrays;

import java.util.ArrayList;

public class Program11_EvenGreaterThanOdd {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        Program11_EvenGreaterThanOdd obj = new Program11_EvenGreaterThanOdd();
        System.out.println("Rearrange array such that even numbers are greater than odd numbers = " + obj.rearrangeArray(arr));

        System.out.println(arr);
    }

    public ArrayList<Integer> rearrangeArray(ArrayList<Integer> arr) {
        // code here

        int n = arr.size();
        for (int i = 1; i < n; i++) {
            if (i % 2 == 1) {
                if (arr.get(i) < arr.get(i - 1))
                    swap(arr, i, i - 1);
            } else {
                if (arr.get(i) > arr.get(i - 1))
                    swap(arr, i, i - 1);
            }
        }
        return arr;

    }

    public void swap(ArrayList<Integer> arr, int left, int right) {
        int temp = arr.get(left);
        arr.set(left, arr.get(right));
        arr.set(right, temp);
    }


}
