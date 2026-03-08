package dsAlgo.arrays;

public class Program15_MissingNum {

    public static void main(String[] args) {
        int[] arr = {1};
        Program15_MissingNum obj = new Program15_MissingNum();
        System.out.println("Missing number in array = " + obj.missingNum(arr));
    }

    int missingNum(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans = ans ^ i;
        }
        for (int num : nums) {
            ans = ans ^ num;
        }
        return ans;

    }
}
