package dsAlgo.striverA2Z.arrayProgram.easy;

public class Program_1 {

    public int largestElement(int[] nums) {

        int largestElement = Integer.MIN_VALUE;

        for(int i = 0; i<nums.length;i++){
            if(nums[i]>largestElement){
                largestElement = nums[i];
            }
        }

        return largestElement;
    }

     public static void main(String[] args) {
         Program_1 obj = new Program_1();
         int[] nums = {1, 2, 3, 4, 5};
         System.out.println("Largest Element in the Array is : " + obj.largestElement(nums));
     }
}
