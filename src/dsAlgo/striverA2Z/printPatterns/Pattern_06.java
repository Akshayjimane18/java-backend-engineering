package dsAlgo.striverA2Z.printPatterns;

/*
    12345
    1234
    123
    12
    1
 */
public class Pattern_06 {

    public static void main(String[] args) {
        int n = 5;
        Pattern_06 obj = new Pattern_06();
        obj.pattern6(n);
    }

    public void pattern6(int n) {

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
