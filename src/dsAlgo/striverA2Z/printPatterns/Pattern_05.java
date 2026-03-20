package dsAlgo.striverA2Z.printPatterns;
/*
    *****
    ****
    ***
    **
    *
*/
public class Pattern_05 {
    public static void main(String[] args) {
        int n = 5;
        Pattern_05 obj = new Pattern_05();
        obj.pattern5(n);
    }

    public void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
