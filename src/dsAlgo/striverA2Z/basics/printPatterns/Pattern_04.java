package dsAlgo.striverA2Z.basics.printPatterns;
/*
    1
    22
    333
    4444
    55555
*/
public class Pattern_04 {
    public static void main(String[] args) {
        int n = 5;
        Pattern_04 obj = new Pattern_04();
        obj.pattern4(n);
    }

    public void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
