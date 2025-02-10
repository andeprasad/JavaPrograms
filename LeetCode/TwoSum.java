/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * 
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 */
package LeetCode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        // int nums[] = {2,7,11,15};
        // int target = 9;
        // int nums[] = {3, 2, 4};
        // int target = 6;
        int nums[] = {3, 3};
        int target = 6;
        System.out.println("The Targe " + target + " is addition of index " + Arrays.toString(twoSum(nums, target)));
    }

    static int[] twoSum(int[] nums, int target) 
    {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) 
            {
                System.out.println(nums[i] + " " + nums[j]);
                int sum = nums[i] + nums[j];
                if(sum == target)
                {
                    System.out.println("Inside IF");
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};    
    }
    
}
