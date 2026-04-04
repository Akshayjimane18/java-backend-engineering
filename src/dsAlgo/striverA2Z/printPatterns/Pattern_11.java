package dsAlgo.striverA2Z.printPatterns;

/*
    0
    1 0
    0 1 0
    1 0 1 0
    0 1 0 1 0
 */
public class Pattern_11 {

    public static void main(String[] args) {
        int n = 5;
        Pattern_11 obj = new Pattern_11();
        obj.pattern11(n);
    }

    public void pattern11(int n) {
        int start;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                start = 1;
            else
                start = 0;

            for (int j = 0; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }
}
