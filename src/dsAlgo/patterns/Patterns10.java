package dsAlgo.patterns;

public class Patterns10 {
    public static void main(String[] args) {
        int n = 5;
        Patterns10 obj = new Patterns10();
        obj.pattern10(n);
    }

    public void pattern10(int n) {
        for (int i = 1; i < n * 2; i++) {

            if (i <= n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = (n * 2) - i; j > 0; j--) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }


}

