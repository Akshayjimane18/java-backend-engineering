package coreJava.practice;

public class TotalOfNumbersWithinString {

    public static void main(String[] args) {
        String input = "10English4Bengali36Mathematics50Physics100";


        char[] a = input.toCharArray();

        String tempNum = "";
        int tempNumeric;

        int totalSum = 0;
        for (int i = 0; i < a.length - 1; i++) {


            int flag = 0;
            if (i <= a.length - 3) {
                if ((a[i] >= 48 && a[i] <= 57) && (a[i + 1] >= 48 && a[i + 1] <= 57) &&
                        (a[i + 2] >= 48 && a[i + 2] <= 57)) {

                    flag = -1;

                    tempNum = Character.toString(input.charAt(i)) + Character.toString(input.charAt(i + 1))
                            + Character.toString(input.charAt(i + 2));
                    tempNumeric = Integer.parseInt(tempNum);
                    totalSum = totalSum + tempNumeric;

                }
            }

            if (flag != -1) {


                if (!Character.isAlphabetic(a[i])) {
                    if ((a[i] >= 48 && a[i] <= 57) && (a[i + 1] >= 48 && a[i + 1] <= 57)) {
                        tempNum = Character.toString(input.charAt(i)) + Character.toString(input.charAt(i + 1));

                        tempNumeric = Integer.parseInt(tempNum);
                        totalSum = totalSum + tempNumeric;
                    }
                } else if (!Character.isAlphabetic(a[i + 1])) {
                    if ((a[i] >= 48 && a[i] <= 57) && (a[i + 1] >= 48 && a[i + 1] <= 57)) {
                        tempNum = Character.toString(input.charAt(i)) + Character.toString(input.charAt(i + 1));

                        tempNumeric = Integer.parseInt(tempNum);
                        totalSum = totalSum + tempNumeric;
                    }
                }
                if (Character.isAlphabetic(a[i]) && (a[i + 1] >= 48 && a[i + 1] <= 57)
                        && Character.isAlphabetic(a[i+2])) {
                    tempNum = Character.toString(input.charAt(i + 1));

                    tempNumeric = Integer.parseInt(tempNum);
                    totalSum = totalSum + tempNumeric;
                }


            }
        }

        System.out.println(totalSum);
        
    }
}
