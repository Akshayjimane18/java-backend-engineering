package dsAlgo.striverA2Z.basics.basicMaths;

public class ReverseNumber {

    public static void main(String[] args) {
        ReverseNumber obj = new ReverseNumber();
        int n = 12345;
        System.out.println(obj.reverseNumber(n));
    }

    public int reverseNumber(int n) {
        long reverseNumber = 0;

        while (n > 0) {
            int temp = n % 10;
            n = n / 10;
            reverseNumber = (reverseNumber * 10) + temp;
        }

        return (int) reverseNumber;
    }
}
