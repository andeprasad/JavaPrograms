/*
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending
 * position of a given target value
 * If target is not found in the array, return [-1, -1].
 * 
 * Example 1:
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * 
 * Example 2:
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 * 
 */

public class FirstAndLastPositionBS {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 7, 7, 7, 8, 8, 10};
        int target = 7;

        // int[] arr = {1};
        // int target = 1;

        int start = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == target)
            {
                start = i;
                break;
            }
        }

        int end = 0;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i] == target)
            {
                end = i;
                break;
            }
        }

        System.out.println("\nThe Start value is " + start);
        System.out.println("\nThe End value is " + end);

        System.out.println("\nThe Starting index of the target " + target + " is " + start + " and the end index is " + end);

    }
}
