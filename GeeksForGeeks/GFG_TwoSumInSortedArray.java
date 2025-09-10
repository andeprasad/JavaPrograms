package GeeksForGeeks;
/*
 * You are given a 1-based indexed integer array arr[] that is sorted in non-decreasing order, 
 * along with an integer target. Your task is to find two elements in the array such that their sum is 
 * equal to target. If such a pair exists, return the indices of the two elements in increasing order. 
 * If no such pair exists, return [-1, -1].
 * Note: If your answer is correct then the driver code will print "true" otherwise "false".
 * 
 * Input: arr[] = [2, 7, 11, 15], target = 9
 * Output: [1, 2]
 * Explanation: Since arr[0] + arr[1] = 2 + 7 = 9 equals the target, return their 1-based indices : [1, 2]
 * 
 * Input: arr[] = [1, 3, 4, 6, 8, 11], target = 10
 * Output: [3, 4]
 * Explanation: Since arr[2] + arr[3] = 4 + 6 = 10 equals the target, return their 1-based indices : [3, 4]
 * 
 */

import java.util.ArrayList;
import java.util.List;

public class GFG_TwoSumInSortedArray {
    public static void main(String[] args) 
    {
//        int[] arr = {2, 7, 11, 15};
//        int target = 9;
//        int[] arr = {2, 5, 10, 10, 11, 12, 13, 18};
//        int target = 18;
//        int[] arr = {3, 8, 11, 11, 11, 15, 19, 19, 21};
//        int target = 19;
        int[] arr = {1, 3, 4, 6, 8, 11};
        int target = 10;
//        System.out.println("The Elements are : " + twoSum(arr, target));
        System.out.println("The Elements are using 2 Pointer Approach : " + twoSumUsingTwoPointerApproach(arr, target));
    }

    static public ArrayList<Integer> twoSum(int[] arr, int target) 
    {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i <arr.length; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if(arr[i]+arr[j] == target)
                {
                    a.add(i+1);
                    a.add(j+1);
                    return a;
                }
            }
        }
        return new ArrayList<>(List.of(-1, -1));
    }


    static public ArrayList<Integer> twoSumUsingTwoPointerApproach(int[] arr, int target)
    {
        ArrayList<Integer> a = new ArrayList<>();
        int i=0, j=arr.length-1;
        while(i < j)
        {
            int sum = arr[i] + arr[j];
            if(sum == target)
            {
                a.add(i+1);
                a.add(j+1);
                return a;
            }
            else if(sum < target)
            {
                i = i + 1;
            }
            else {
                j = j - 1;
            }
        }
        return new ArrayList<>(List.of(-1, -1));
    }
}
