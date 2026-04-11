package dsAlgo.striverA2Z.basics.basicMaths;

public class ArmStrong {

    public static void main(String[] args) {
        ArmStrong obj = new ArmStrong();
        int n = 153;
        System.out.println(obj.isArmstrong(n));
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
            int tempCalcu;
            tempCalcu = (int) Math.pow(temp, counter);
            armStrongNumber = armStrongNumber + tempCalcu;
        }

        return n == armStrongNumber;
    }
}
