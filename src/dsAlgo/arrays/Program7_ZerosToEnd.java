package dsAlgo.arrays;

import java.util.Arrays;

public class Program7_ZerosToEnd {

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 0, 0, 0, 5, 0};

        Program7_ZerosToEnd obj = new Program7_ZerosToEnd();
        obj.pushZerosToEnd(arr);

        System.out.println("Move all zeros to end of array = "+ Arrays.toString(arr));
    }
    void pushZerosToEnd(int[] arr) {
        // code here
        int j = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}
