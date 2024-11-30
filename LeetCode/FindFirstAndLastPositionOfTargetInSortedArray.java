/*
 * Given an array of integers nums sorted in non-decreasing order, 
 * find the starting and ending position of a given target value.
 * If target is not found in the array, return [-1, -1].
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * Example 1:
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * 
 * Example 2:
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 * 
 * Example 3:
 * Input: nums = [], target = 0
 * Output: [-1,-1]
 */

package LeetCode;

import java.util.Arrays;

public class FindFirstAndLastPositionOfTargetInSortedArray {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 7, 7, 7, 8, 8, 10};
        // int target = 8;
        int target = 7;
        // int target = 11;
        System.out.println("The First And Last Index of the Target : " + target + " is : " + Arrays.toString(searchRange(nums, target)));
    }

    //Approach by Binary Search Algorithm
    static public int[] searchRange(int[] nums, int target) 
    {
        int start = search(nums, target, true), end = search(nums, target, false);
        
        return new int[]{start, end};
    }

    static int search(int[] nums, int target, boolean findStart)
    {
        int ans = -1;
        int start = 0, end = nums.length-1;
        int mid = 0;
        while(start <= end)
        {
            mid = (start + end)/2;
            if(target < nums[mid])
            {
                end = mid - 1;
            }
            else if(target > nums[mid])
            {
                start = mid + 1;
            }
            else
            {
                ans = mid;
                if(findStart)
                {
                    end = mid - 1;
                }
                else
                {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }

    //This is the not the optimised way to do
    // static public int[] searchRange(int[] nums, int target) 
    // {
    //     int start = 0, end =0;
    //     for(int i=0;i<nums.length-1;i++)
    //     {
    //         if(nums[i] == target)
    //         {
    //             start = i;
    //             break;
    //         }
    //     }

    //     for(int i=nums.length-1;i>=0;i--)
    //     {
    //         if(nums[i] == target)
    //         {
    //             end = i;
    //             return new int[]{start, end};
    //         }
    //     }

    //     return new int[]{-1, -1};
    // }
}
