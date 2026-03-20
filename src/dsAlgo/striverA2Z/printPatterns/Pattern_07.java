package dsAlgo.striverA2Z.printPatterns;

/*
     *
    ***
   *****
  *******
 *********
 */
public class Pattern_07 {

    public static void main(String[] args) {
        int n = 5;
        Pattern_07 obj = new Pattern_07();
        obj.pattern7(n);
    }

    public void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j < i * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
