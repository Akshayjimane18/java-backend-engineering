package dsAlgo.striverA2Z.basics.recurssion;

public class Palindrome {

    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        String s = "madam";
        System.out.println(obj.palindromeCheck(s));
    }

    public boolean palindromeCheck(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
