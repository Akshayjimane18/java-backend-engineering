package dsAlgo.arrays;

import java.util.Arrays;

public class Program4_ReverseArray {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        int [] a = {2, 423, 23, 2, 534, 22, 754,2};

        System.out.println("Reversed array = "+ Arrays.toString(reversedArray(a)));

    }

    static int[] reversedArray(int[] arr){
        int temp;
        int n = arr.length-1;

        for(int i=0;i<arr.length/2;i++){
            temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp;
            n--;
        }

        return arr;
    }
}
