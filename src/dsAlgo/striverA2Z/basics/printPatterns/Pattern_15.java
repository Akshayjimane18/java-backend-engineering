package dsAlgo.striverA2Z.basics.printPatterns;

public class Pattern_15 {

    /**
     *
     * A B C D E
     * A B C D
     * A B C
     * A B
     * A
     */
    public static void main(String[] args) {
        int n = 5;
        Pattern_15 obj = new Pattern_15();
        obj.pattern15(n);
    }

    public void pattern15(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print( (char) ('A' + j));
            }
            System.out.println();
        }
    }
}
