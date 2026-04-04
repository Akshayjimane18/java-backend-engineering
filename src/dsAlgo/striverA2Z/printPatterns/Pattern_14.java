package dsAlgo.striverA2Z.printPatterns;

public class Pattern_14 {

    /**
     * A
     * A B
     * A B C
     * A B C D
     * A B C D E
     */
    public static void main(String[] args) {
        int n = 5;
        Pattern_14 obj = new Pattern_14();
        obj.pattern14(n);
    }

    public void pattern14(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                char c = (char) ('A' + j);
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
