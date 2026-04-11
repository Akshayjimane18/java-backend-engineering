package dsAlgo.striverA2Z.basics.recurssion;

public class PrintSequence {

    public static void main(String[] args) {
        PrintSequence obj = new PrintSequence();
        int n = 5;
        obj.printNumbers(n);
    }

    public void printNumbers(int n) {
        // Your code goes here
        if (n <= 0)
            return;

        printNumbers(n - 1);
        System.out.println(n);
    }
}
