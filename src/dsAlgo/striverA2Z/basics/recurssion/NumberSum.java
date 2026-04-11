package dsAlgo.striverA2Z.basics.recurssion;

public class NumberSum {

    public static void main(String[] args) {
        NumberSum obj = new NumberSum();
        int n = 5;
        System.out.println(obj.NnumbersSum(n));
    }

    public int NnumbersSum(int N) {

        if (N <= 0) {
            return 0;
        }


        return N + NnumbersSum(N - 1);
    }
}
