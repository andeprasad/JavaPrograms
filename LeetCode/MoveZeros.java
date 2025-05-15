package LeetCode;

import java.util.Arrays;
import java.util.Stack;

public class MoveZeros {
    public static void main(String[] args) 
    {
        // int[] nums = {0, 1, 0, 3, 12};
        // int[] nums = {0, 0, 1};
        int[] nums = {0, 1, 0};
        
        moveZeroes(nums);
        System.out.println("The Updated Array is : " + Arrays.toString(nums));
    }

    static void moveZeroes(int[] nums) 
    {
        System.out.println("Initial Array is : " + Arrays.toString(nums));
        if(nums.length == 1)
            return ;

        Stack<Integer> s = new Stack<>();
        int zeroCount = 0;
        for (int i = 0; i < nums.length; i++) 
        {
            if(nums[i] == 0)
            {
                zeroCount++;
            }
            else
            {
                s.add(nums[i]);
            }
        }
        
        for (int i = nums.length-1; i >= nums.length-zeroCount; i--) 
        {
            nums[i] = 0;
        }
        
        for (int i = (nums.length-1)-zeroCount; i >= 0; i--) 
        {
            nums[i] = s.pop();    
        }
    }
}
