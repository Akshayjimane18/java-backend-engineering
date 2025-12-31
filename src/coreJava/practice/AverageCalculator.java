package coreJava.practice;
import java.util.Scanner;
public class AverageCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    static Scanner sc = new Scanner(System.in);
    // write code here
    public static void inputThenPrintSumAndAverage (){
        double sum=0;
        long devider=0;

        while(true) {
            try {
                String input = sc.next();
                sum = (Double.parseDouble(input))+sum;
                devider++;
            } catch(Exception e){
                break;
            }
        }


        long average = 0;
        average= Math.round(sum/devider);

        System.out.println("SUM = "+((long)sum)+" AVG = "+average);
    }
}
