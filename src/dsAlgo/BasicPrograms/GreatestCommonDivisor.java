package dsAlgo.BasicPrograms;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 15;
        GreatestCommonDivisor obj = new GreatestCommonDivisor();
        System.out.println("GCD of " + n1 + " and " + n2 + " is " + obj.GCD(n1, n2));
    }

    public int GCD(int n1, int n2) {
        int dividern1 = 1;
        int commonValue = 0;
        while (n1 >= dividern1 || n2 >= dividern1) {
            if (n1 % dividern1 == 0 && n2 % dividern1 == 0) {
                commonValue = dividern1;
            }

            dividern1++;
        }

        return commonValue;
    }
}
