package dsAlgo.striverA2Z.basics.recurssion;

public class Reverse {

    public static void main(String[] args) {
        Reverse obj = new Reverse();
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        obj.reverse(arr, n);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public void reverse(int[] arr, int n) {
        int start = 0;
        int end = n - 1;
        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
