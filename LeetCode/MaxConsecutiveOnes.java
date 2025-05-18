package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class MaxConsecutiveOnes 
{
    public static void main(String[] args) 
    {
        int[] nums = {1,1,0,1,1,1};
        // int[] nums = {1,0,1,1,0,1};
        // int[] nums = {1};
        // int[] nums = {0, 1};
        // int[] nums = {0};

        // System.out.println("The max consecutive ones is : " + findMaxConsecutiveOnes(nums));
        System.out.println("Max consecutive of ones is : " + maxUsingDifferentApproach(nums));
    }

    static int maxUsingDifferentApproach(int[] nums)
    {
        if(nums[0] == 1 && nums.length == 1)
        {
            return 1;
        }
        else if(nums[0] == 0 && nums.length == 1) 
        {
            return 0;
        }

        int max = 0;
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) 
        {
            if (nums[i] == 1) 
            {
                if(m.containsKey(1))
                {
                    int value = m.get(1);
                    value = value + 1;
                    m.put(1, value);
                    if(max < value)
                    {
                        max = value;
                    }   
                }
                else
                {
                    m.put(1, 1);
                    if(max < 1)
                    {
                        max = 1;
                    }
                }
            }
            else
            {
                if(m.containsKey(1))
                {
                    int value = m.get(1);
                    if(max < value)
                    {
                        max = value;
                    }
                    m.remove(1);
                }
            }
        }
        return max;
    }

    // This below code is giving time exceed while submitting the code.
    static int findMaxConsecutiveOnes(int[] nums) 
    {
        int max = 0;
        for (int i = 0; i < nums.length; i++) 
        {
            int count = 0;
            if(nums[i] == 1)
            {
                for (int j = i; j < nums.length; j++) 
                {
                    if(1 == nums[j])
                    {
                        count++;
                    }    
                    else
                    {
                        break;
                    }
                }
                if(max < count)
                {
                    max = count;
                }
            }    
        }

        return max;    
    }
    
}
