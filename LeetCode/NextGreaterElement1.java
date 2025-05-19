/*
 * The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.
 * You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.
 * 
 * Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
 * Output: [-1,3,-1]
 * Explanation: The next greater element for each value of nums1 is as follows:
 * - 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
 * - 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
 * - 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
 * 
 * Input: nums1 = [2,4], nums2 = [1,2,3,4]
 * Output: [3,-1]
 * Explanation: The next greater element for each value of nums1 is as follows:
 * - 2 is underlined in nums2 = [1,2,3,4]. The next greater element is 3.
 * - 4 is underlined in nums2 = [1,2,3,4]. There is no next greater element, so the answer is -1.
 * 
 */
package LeetCode;

import java.util.Arrays;

public class NextGreaterElement1 
{
    public static void main(String[] args) 
    {
        // int[] nums1 = {4,1,2}, nums2 = {1,3,4,2};    
        // int[] nums1 = {2, 4}, nums2 = {1, 2, 3, 4};    
        int[] nums1 = {1,3,5,2,4}, nums2 = {6,5,4,3,2,1,7};    

        System.out.println("The Array is : " + Arrays.toString(nextGreaterElement(nums1, nums2)));
    }
    
    static int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        int count = 0;
        int[] arr = new int[nums1.length];
        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i] == nums2[j])
                {
                    int max = 0;
                    for (int k = j; k < nums2.length; k++) {
                        if(nums2[j] < nums2[k])
                        {
                            max = nums2[k];
                            found = true;
                            break;
                        }
                    }
                    if(max != 0)
                    {
                        found = true;
                        arr[count] = max;
                        count++;
                    }
                    else
                    {
                        found = true;
                        arr[count] = -1;
                        count++;
                    }
                }
            }
            if(found == false)
            {
                arr[count] = -1;
                count++;
            }
        }

        return arr;
    }
}
