package dsAlgo.striverA2Z.basics.basicMaths;

public class CountDigits {

    public static void main(String[] args) {
        CountDigits obj = new CountDigits();
        int n = 12345;
        System.out.println(obj.countDigit(n));
    }

    public int countDigit(int n) {

        if (n == 0) {
            return 1;
        }
        int incrementer = 0;

        while (n > 0) {
            incrementer++;

            n = n / 10;
        }

        return incrementer;
    }

}
