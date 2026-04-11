package dsAlgo.striverA2Z.basics.printPatterns;

/*
 *********
  *******
   *****
    ***
     *
 */
public class Pattern_08 {

    public static void main(String[] args) {
        int n = 5;
        Pattern_08 obj = new Pattern_08();
        obj.pattern8(n);
    }

    public void pattern8(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }

            for (int j = i; j < n; j++) {
                System.out.print("*");
            }


            System.out.println();
        }
    }
}
