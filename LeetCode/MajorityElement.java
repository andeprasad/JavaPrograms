/*
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 * Input: nums = [3,2,3]
 * Output: 3
 * 
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 * 
 */

package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement
{
    public static void main(String[] args) 
    {
        // int nums[] = {2, 2, 1, 1, 1, 2, 2};
        // int nums[] = {3, 2, 3};
        // int nums[] = {1};
        // int nums[] = {8,8,7,7,7};
        int nums[] = {-1,1,1,1,2,1};
        
        System.out.println("The Majority is : " + majorityElement(nums));
    }

    static int majorityElement(int[] nums) 
    {
        Map<Integer, Integer> m = new HashMap<>();
        if(nums.length == 1)
        {
            return nums[0];
        }
        int maj = 0;
        int max_element = 0;
        for (int i : nums) {
            if(m.containsKey(i))
            {
                int value = m.get(i);
                m.put(i, value+1);
                if(max_element < value+1)
                {
                    maj = i;
                    max_element = value +1;
                }
            }
            else
            {
                m.put(i, 1);
                // maj = i;
            }
        }
        return maj;
    }
}