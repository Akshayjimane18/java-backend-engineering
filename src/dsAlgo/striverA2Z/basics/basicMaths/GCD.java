package dsAlgo.striverA2Z.basics.basicMaths;

public class GCD {

    public static void main(String[] args) {
        GCD obj = new GCD();
        int n1 = 12;
        int n2 = 15;
        System.out.println(obj.gcd(n1, n2));
    }

    public int gcd(int n1, int n2) {
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
