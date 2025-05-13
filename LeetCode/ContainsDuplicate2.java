/*
 * Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array 
 * such that nums[i] == nums[j] and abs(i - j) <= k.
 * 
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 * 
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 * 
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 * 
 */
package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate2 {
    public static void main(String[] args) {
        // int[] nums = {1, 2, 3, 1};
        // int k = 3;

        int[] nums = {1,0,1,1};
        int k = 1;
        
        // System.out.println("The Duplicate is Present : " + containsNearbyDuplicate(nums, k));
        System.out.println("The Duplicate is Present : " + containsNearbyDuplicateUsingSet(nums, k));
    }

    // This will also work but while submitting the answer in the leetcode its exceeding the time limit, So to enhance we used Set in the another seperate method
    static public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j])
                {
                    if(j - i <= k)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static public boolean containsNearbyDuplicateUsingSet(int[] nums, int k) 
    {
        Set<Integer> s = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if(s.contains(nums[i]))
            {
                return true;
            }
            s.add(nums[i]);

            if(s.size()> k)
            {
                s.remove(nums[i - k]);
            }
        }
        System.out.println("Set is : " + s);
        return false;
    }
}
