package dsAlgo.arrays;

public class Program1_SecondLargestElement {
    public static void main(String[] args) throws java.lang.Exception {
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
