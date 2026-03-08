package dsAlgo.arrays;

public class Program14_UniqueNumberInArray {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 5, 3, 4};
        Program14_UniqueNumberInArray obj = new Program14_UniqueNumberInArray();
        System.out.println("Unique number in array = " + obj.findUnique(arr));
    }

    public int findUnique(int[] arr) {
        int res = 0;
        for (int j : arr) {
            // XOR the current result with the current array element.
            // '^' is the bitwise XOR operator.
            //
            // Important properties of XOR:
            // 1. a ^ a = 0  (same numbers cancel out)
            // 2. a ^ 0 = a  (XOR with 0 keeps the number unchanged)
            //
            // Because of this property, XOR is often used to:
            // - find the unique element in an array
            // - remove duplicates when every element appears twice
            //
            // Equivalent to: res = res ^ arr[i];
            res ^= j;
        }
        return res;
    }
}
