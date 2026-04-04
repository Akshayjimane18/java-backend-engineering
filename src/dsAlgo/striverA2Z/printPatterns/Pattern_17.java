package dsAlgo.striverA2Z.printPatterns;

public class Pattern_17 {

    /**
     *
     *     A
     *    A B A
     *   A B C B A
     *  A B C D C B A
     * A B C D E D C B A
     *
     */
    public static void main(String[] args) {
        int n = 5;
        Pattern_17 obj = new Pattern_17();
        obj.pattern17(n);
    }

    public void pattern17(int n) {
        for (int i = 0; i < n; i++) {

            // Printing spaces before characters.
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Printing characters.
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch);
                if (j <= breakpoint)
                    ch++;
                else
                    ch--;
            }

            // Move to the next line for the next row.
            System.out.println();
        }
    }
}
