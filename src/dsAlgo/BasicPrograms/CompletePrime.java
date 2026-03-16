package dsAlgo.BasicPrograms;

public class CompletePrime {
    public static void main(String[] args) {
        int n = 27;
        CompletePrime obj = new CompletePrime();
        System.out.println("Is " + n + " complete prime number? " + obj.completePrime(n));
    }

    private boolean isPrime(int n) {
        if (n != 2 && n % 2 == 0) return true;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return true;
        }
        return false;
    }

    public boolean completePrime(int num) {
        int y = 0, z = 1, x = num;
        while (x > 0) {
            y = z * (x % 10) + y;
            if (y == 1 || isPrime(y)) return false;
            if (x == 1 || isPrime(x)) return false;
            x /= 10;
            z *= 10;
        }
        return true;
    }
}
