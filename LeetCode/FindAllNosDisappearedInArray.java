package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllNosDisappearedInArray 
{
    public static void main(String[] args) 
    {
        int[] nums = {4,3,2,7,8,2,3,1};
        // int[] nums = {1, 1};
        System.out.println("The No which is not present are : " + findDisappearedNumbers(nums));
    }
    
    static List<Integer> findDisappearedNumbers(int[] nums) 
    {
        List<Integer> l = new ArrayList<>();
        // Arrays.sort(nums);   
        // System.out.println("After Sorting the Array is : " + Arrays.toString(nums));
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            s.add(nums[i]);
        }
        System.out.println("Set is : " + s);

        for (int i = 1; i <= nums.length; i++) {
            if(!s.contains(i))
                l.add(i);
        }
        return l;
    }
}
