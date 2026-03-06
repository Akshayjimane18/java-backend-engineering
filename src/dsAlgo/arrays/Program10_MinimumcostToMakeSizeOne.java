package dsAlgo.arrays;

public class Program10_MinimumcostToMakeSizeOne {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        Program10_MinimumcostToMakeSizeOne obj = new Program10_MinimumcostToMakeSizeOne();
        System.out.println("Minimum cost to make size one = " + obj.cost(arr));
    }
    public int cost(int[] arr) {
        // code here

        int min = Integer.MAX_VALUE;
        for (int value : arr) {
            if (value < min) {
                min = value;
            }
        }

        return (arr.length-1)*min;
    }
}
