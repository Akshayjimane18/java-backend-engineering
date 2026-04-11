package dsAlgo.striverA2Z.basics.printPatterns;

public class Pattern_18 {

    /**
     * E
     * D E
     * C D E
     * B C D E
     * A B C D E
     */
    public static void main(String[] args) {
        int n = 5;
        Pattern_18 obj = new Pattern_18();
        obj.pattern18(n);
    }

    public void pattern18(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j <= n - 1; j++) {
                System.out.print((char) ('A' + j) + " ");
            }
            System.out.println();
        }
    }
}
