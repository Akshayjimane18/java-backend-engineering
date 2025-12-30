package coreJava.practice;

public class SecondLargest {

    public int findSecondLargestElement(int[] array) {
        //TODO: Write your code here
        if(array.length<3) {
            return -1;
        }

        int largest=0, secondLargest=0;
        for (int i=0; i<array.length;i++ ) {
            if(largest<array[i]) {
                secondLargest=largest;
                largest=array[i];
            } else if (secondLargest<array[i] && array[i]!=largest) {
                secondLargest=array[i];
            }
        }



        if(secondLargest==0) {
            return -1;
        } else {
            return secondLargest;
        }

    }

    public static void main(String[] args) {
        int [] array = {5, 5, 5, 4, 4};
        SecondLargest sl = new SecondLargest();

        System.out.println(sl.findSecondLargestElement(array));
    }
}
