/*
 * Input: nums = [1,1,2]
 * Output: 2, nums = [1,2,_]
 * Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 * 
 * Input: nums = [0,0,1,1,1,2,2,3,3,4]
 * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 * Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 */

package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class RemoveDuplicatFrmSortedArray {
    public static void main(String[] args) {
        // int[] nums = {3,2,2,3};
        // int[] nums = {1, 1, 2};
        int[] nums = {-3,-1,0,0,0,3,3};
        // int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("The No of Dupllicates are : " + removeDuplicates(nums));
        System.out.println("The nums is : " + Arrays.toString(nums));
    }

    static public int removeDuplicates(int[] nums) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i]))
            {
                continue;
            }
            else
            {
                map.put(nums[i], 0);
            }
        }

        // Sorting the Order by Key
        Map<Integer, Integer> sortedByKey = new TreeMap<>(map);
        System.out.println("Sorted Map : " + sortedByKey);

        int count = 0;
        for (Integer i : sortedByKey.keySet()) {
            System.out.println(i);
            nums[count] = i;
            count++;            
        }
        return map.size();    
    }
}
