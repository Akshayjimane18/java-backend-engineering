package dsAlgo.striverA2Z.basics.basicMaths;

import java.util.Arrays;

public class DivisorOfNumber {

    public static void main(String[] args) {
        DivisorOfNumber obj = new DivisorOfNumber();
        int n = 12;
        System.out.println(Arrays.toString(obj.divisors(n)));
    }

    public int[] divisors(int n) {
        int dividern1 = 1;
        int[] list = new int[n];
        int index = 0;
        while (n >= dividern1) {
            if (n % dividern1 == 0) {
                list[index++] = dividern1;
            }
            dividern1++;
        }

        return Arrays.copyOf(list, index);
    }
}
