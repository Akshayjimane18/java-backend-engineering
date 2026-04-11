package dsAlgo.striverA2Z.basics.recurssion;

public class PrintReverse {

    public static void main(String[] args) {
        PrintReverse obj = new PrintReverse();
        int n = 5;
        obj.printNumbers(n);
    }

    public void printNumbers(int n) {

        if (n <= 0)
            return;

        System.out.println(n);
        printNumbers(n - 1);


    }
}
