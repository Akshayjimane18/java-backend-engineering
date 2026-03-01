package dsAlgo.arrays;

public class Program2_ThirdLargestElement {
    public static void main(String[] args) throws Exception {
        // your code goes here
        int[] a = {2, 423, 23, 2, 534, 22, 754, 2};

        System.out.println("Third Largest = " + thirdLargest(a));

    }

    static int thirdLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for (int j : arr) {
            if (j > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = j;
            } else if (j > secondLargest) {
                thirdLargest = secondLargest;
                secondLargest = j;
            } else if (j > thirdLargest) {
                thirdLargest = j;
            }
        }

        return thirdLargest;
    }
}
