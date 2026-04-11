package dsAlgo.striverA2Z.basics.printPatterns;

public class Pattern_16 {
    /**
     * A
     * B B
     * C C C
     * D D D D
     * E E E E E
     */
    public static void main(String[] args) {
        int n = 5;
        Pattern_16 obj = new Pattern_16();
        obj.pattern16(n);
    }

    public void pattern16(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                char c = (char) ('A' + i);
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
