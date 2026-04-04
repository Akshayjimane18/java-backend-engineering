package dsAlgo.striverA2Z.printPatterns;

public class Pattern_12 {

    /**
     * 1        1
     * 12      21
     * 123    321
     * 1234  4321
     * 1234554321
     */
    public static void main(String[] args) {
        int n = 5;
        Pattern_12 obj = new Pattern_12();
        obj.pattern12(n);
    }

    public void pattern12(int n) {

        int spaces = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // For printing spaces in each row
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }

            System.out.println();
            /* After each iteration nos. increase by
            2, thus spaces will decrement by 2*/
            spaces -= 2;
        }
    }
}
