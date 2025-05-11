/*
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * 
 * Input: nums = [2,2,1]
 * Output: 1
 * 
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 * 
 * Input: nums = [1]
 * Output: 1
 */

package LeetCode;

import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) 
    {
        // int[] nums = {2, 2, 1};
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println("The Non repeating number is : " + singleNumber(nums));
    }


    static public int singleNumber(int[] nums) 
    {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();

        for (int i : nums) {
            if(m.containsKey(i))
            {
                int value = m.get(i);
                value += 1;
                m.put(i, value);
            }
            else
            {
                m.put(i,1);
            }
        }

        System.out.println("Map is : " + m);

        for (int i : m.keySet()) 
        {
            System.out.println("Key is : " + i);
            System.out.println("Value is : " + m.get(i));
            if(m.get(i) == 1)
            {
                return i;
            }
        }
        return 0;
    }
}
