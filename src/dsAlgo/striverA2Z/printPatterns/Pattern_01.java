package dsAlgo.striverA2Z.printPatterns;

/*
 * 1. You are given a number n.
 * 2. You've to print the pattern given in output format below.
 *
 * n = 5
 * *****
 * *****
 * *****
 * *****
 * *****
 */
public class Pattern_01 {
    public static void main(String[] args) {
        int n = 5;
        pattern1(n);
    }

    public static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
