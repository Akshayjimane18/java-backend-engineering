package dsAlgo.striverA2Z.basics.basicMaths;

public class PalindromNumber {

    public static void main(String[] args) {
        PalindromNumber obj = new PalindromNumber();
        int n = 12321;
        System.out.println(obj.isPalindrome(n));
    }

    public boolean isPalindrome(int n) {
        int reverseNumber = 0;
        int duplicate = n;
        while (duplicate > 0) {
            int temp = duplicate % 10;
            duplicate = duplicate / 10;
            reverseNumber = (reverseNumber * 10) + temp;
        }

        return n == reverseNumber;
    }
}
