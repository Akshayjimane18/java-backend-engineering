package dsAlgo.BasicPrograms;

public class ArmstronNumber {
    public static void main(String[] args) {
        int n = 153;
        ArmstronNumber obj = new ArmstronNumber();
        System.out.println(n + " is armstrong number = " + obj.isArmstrong(n));
    }
    public boolean isArmstrong(int n) {
        int duplicate = n;
        int armStrongNumber = 0;
        int counter = 0;
        while (duplicate > 0) {
            duplicate = duplicate / 10;
            counter++;
        }

        duplicate = n;

        while (duplicate > 0) {
            int temp = duplicate % 10;
            duplicate = duplicate / 10;
            int tempCalcu = 1;
            for (int i = 1; i <= counter; i++) {
                tempCalcu = tempCalcu*temp;
            }
            armStrongNumber = armStrongNumber + tempCalcu;
        }

        return n == armStrongNumber;
    }
}
