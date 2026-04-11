package dsAlgo.striverA2Z.basics.recurssion;

public class Factorial {

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        int n = 5;
        System.out.println(obj.factorial(n));
    }

    public int factorial(int n) {

        if (n <= 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
