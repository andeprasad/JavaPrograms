package LeetCode;

import java.util.Arrays;

/*
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing 
 * the number of elements in nums1 and nums2 respectively.
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * 
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 * 
 * Input: nums1 = [1], m = 1, nums2 = [], n = 0
 * Output: [1]
 * Explanation: The arrays we are merging are [1] and [].
 * The result of the merge is [1].
 * 
 * Input: nums1 = [0], m = 0, nums2 = [1], n = 1
 * Output: [1]
 * Explanation: The arrays we are merging are [] and [1].
 * The result of the merge is [1].
 * Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
 * 
 */

public class MergeSortedArray {
    public static void main(String[] args) {
        // int num1[] = {1, 2, 3, 0, 0, 0}, m = 3;
        // int num2[] = {2, 5, 6}, n = 3;

        // int num1[] = {1}, m = 1;
        // int num2[] = {}, n = 0;

        // int num1[] = {0}, m = 0;
        // int num2[] = {1}, n = 1;

        int num1[] = {4,5,6,0,0,0}, m = 3;
        int num2[] = {1,2,3}, n = 3;

        // MergeSortUsingSortFxn(num1, m, num2, n);
        MergeUsingTwoPointer(num1, m, num2, n);

        System.out.println("The Updated Final Array is : " + Arrays.toString(num1));
    }

    static void MergeSortUsingSortFxn(int[] num1, int m, int[] num2, int n)
    {
        if(n == 0)
        {
            System.out.println("As n is 0, So the Array is : " + Arrays.toString(num1));
        }
        else
        {
            int j1=0;
            for (int i = m; i < m+n; i++) {
                num1[i] = num2[j1];
                j1++;
            }
            System.out.println("The Num1 Array is : " + Arrays.toString(num1));
            Arrays.sort(num1);
        }
    }

    static void MergeUsingTwoPointer(int[] nums1, int m, int[] nums2, int n)
    {
        if(n == 0)
        {
            System.out.println("As n is 0, So the Array is : " + Arrays.toString(nums1));
        }
        else
        {
            int i = m-1, j = n-1, k = m+n-1;
            while(j >= 0)
            {
                if(i >= 0 && nums1[i] > nums2[j])
                {
                    nums1[k] = nums1[i];
                    k--;
                    i--;
                }
                else
                {
                    nums1[k] = nums2[j];
                    k--;
                    j--;
                }
                System.out.println("After adding the Num1 is : " + Arrays.toString(nums1) + " and num2 is : " + Arrays.toString(nums2));
            }
        }
    }
}
