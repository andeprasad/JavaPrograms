package LeetCode;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) 
    {
        // int[] nums = {3,0,1};
        int[] nums = {9,6,4,2,3,5,7,0,1};
        // int[] nums = {0,1};

        System.out.println("The Missing number is : " + missingNumberUsingSort(nums));
    }

    static int missingNumberUsingSort(int[] nums) 
    {
        Arrays.sort(nums);
        System.out.println("After sorting the array is : " + Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) 
        {
            System.out.println("I is : " + i);
            if(i != nums[i])
            {
                return i;
            }
        }
        return nums.length;
    }
}
