package dsAlgo.striverA2Z.printPatterns;

/*
    1
    12
    123
    1234
    12345
*/
public class Pattern_03 {


    public static void main(String[] args) {
        int n = 5;
        Pattern_03 obj = new Pattern_03();
        obj.pattern3(n);
    }

    public void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
