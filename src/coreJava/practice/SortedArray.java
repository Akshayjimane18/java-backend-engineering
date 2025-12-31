package coreJava.practice;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static void main(String[] args) {
        int[] array = {4, 3, 2, 1, 5};

        System.out.println(Arrays.toString(sortIntegers(array)));
    }

    public static int[] getIntegers(int sizeOfArray) {
        int [] array = new int [sizeOfArray];

        Scanner scanner = new Scanner(System.in);
        int counter=0;
        while(counter<sizeOfArray) {
            array[counter] = scanner.nextInt();
            counter++;
        }
        return array;
    }

    public static void printArray(int [] array) {
        for (int i=0;i<array.length-1 ; i++){
            System.out.println("Element "+i+" contents "+array[i]);
        }
    }

    public static int[] sortIntegers(int [] array) {
        int temp=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
