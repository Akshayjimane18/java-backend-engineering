package dsAlgo.striverA2Z.basics.printPatterns;
/*
     *
    ***
   *****
  *******
 *********
  *******
   *****
    ***
     *
 */
public class Pattern_09 {

    public static void main(String[] args) {
        int n = 5;
        Pattern_09 obj = new Pattern_09();
        obj.pattern9(n);
    }

    public void pattern9(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j < i * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

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
