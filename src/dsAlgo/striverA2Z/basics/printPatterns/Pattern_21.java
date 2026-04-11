package dsAlgo.striverA2Z.basics.printPatterns;

public class Pattern_21 {

    /**
     * *****
     * *   *
     * *   *
     * *   *
     * *****
     */
    public static void main(String[] args) {
        int n = 5;
        Pattern_21 obj = new Pattern_21();
        obj.pattern21(n);
    }

    public void pattern21(int n) {
        for (int j = 0; j < n; j++) {

            for (int i = 0; i < n; i++) {

                if (j == 0 || j == n - 1 || i == 0 || i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();
        }
    }
}
