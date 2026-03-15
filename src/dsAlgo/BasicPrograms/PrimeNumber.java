package dsAlgo.BasicPrograms;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 11;
        PrimeNumber obj = new PrimeNumber();
        System.out.println("Is number " + n + " is prime number? " + obj.isPrime(n));
    }

    public boolean isPrime(int n) {
        //your code goes here
        if (n < 2) {
            return true;
        }

        int tempNumber = n - 1;
        while (tempNumber > 2) {
            if (n % tempNumber == 0) {
                return false;
            }

            tempNumber--;
        }

        return true;
    }
}
