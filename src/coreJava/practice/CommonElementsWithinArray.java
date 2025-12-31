package coreJava.practice;

import java.util.ArrayList;
import java.util.List;

public class CommonElementsWithinArray {

    public static void main(String[] args) {


        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 5, 7, 9};
        int[] arr3 = {1, 3, 4, 5, 8};

        List<Integer> comonElements = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr1.length; j++) {

                if (arr1[i] == arr2[j]) {

                    for (int a = 0; a < arr1.length; a++) {

                        if (arr1[i] == arr3[a]) {
                            comonElements.add(arr1[i]);
                        }
                    }
                }

            }

        }


        System.out.println(comonElements);


    }
}
