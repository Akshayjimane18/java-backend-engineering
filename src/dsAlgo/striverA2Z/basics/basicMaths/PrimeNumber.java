package dsAlgo.striverA2Z.basics.basicMaths;

public class PrimeNumber {

    public static void main(String[] args) {
        PrimeNumber obj = new PrimeNumber();
        int n = 11;
        System.out.println(obj.isPrime(n));
    }

    public boolean isPrime(int n) {
        //your code goes here
        if (n == 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
