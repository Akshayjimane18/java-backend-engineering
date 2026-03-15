package dsAlgo.BasicPrograms;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 12345;
        ReverseNumber obj = new ReverseNumber();
        System.out.println("Reverse of number " + n + " is " + obj.reverseNumber(n));
    }

    public int reverseNumber(int n) {
        int reverseNumber = 0;

        while (n > 0) {
            int temp = n % 10;
            n = n / 10;
            reverseNumber = (reverseNumber * 10) + temp;
        }

        return reverseNumber;
    }
}
