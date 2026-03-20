package dsAlgo.striverA2Z.printPatterns;

/*
    *
    **
    ***
    ****
    *****
*/
public class Pattern_02 {
    public static void main(String[] args) {
        int n = 5;
        Pattern_02 obj = new Pattern_02();
        obj.pattern2(n);
    }

    public void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
