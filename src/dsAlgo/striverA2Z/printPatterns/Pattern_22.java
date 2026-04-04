package dsAlgo.striverA2Z.printPatterns;

public class Pattern_22 {

    public static void main(String[] args) {
        int n = 5;
        Pattern_22 obj = new Pattern_22();
        obj.pattern22(n);
    }

    public void pattern22(int n) {
        for (int i = 0; i < n * 2 - 1; i++) {
            for (int j = 0; j < n * 2 - 1; j++) {

                // Distance of current cell from all four boundaries
                int right = (2 * n - 2) - j;
                int bottom = (2 * n - 2) - i;

                // The minimum distance from any boundary gives the layer number
                int value = n - Math.min(Math.min(i, bottom), Math.min(j, right));

                // Print the current value
                System.out.print(value);
                if (j < 2 * n - 2) System.out.print(" ");
            }

            System.out.println();
        }
    }
}
