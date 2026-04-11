package dsAlgo.striverA2Z.basics.printPatterns;

public class Pattern_13 {

    /**
     * 1
     * 2 3
     * 4 5 6
     * 7 8 9 10
     * 11 12 13 14 15
     */
    public static void main(String[] args) {
        int n = 5;
        Pattern_13 obj = new Pattern_13();
        obj.pattern13(n);
    }

    public void pattern13(int n) {
        int number = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
