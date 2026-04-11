package dsAlgo.striverA2Z.basics.printPatterns;

/*
    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
 */
public class Pattern_10 {

    public static void main(String[] args) {
        int n = 5;
        Pattern_10 obj = new Pattern_10();
        obj.pattern10(n);
    }

    public void pattern10(int n) {
        for (int i = 1; i < n * 2; i++) {

            int stars = i;

            if (i > n) {
                stars = 2 * n - i;
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
