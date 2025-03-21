/*
 * Given an array arr[]. The task is to find the largest element and return it.
 * 
 * Input: arr = [1, 8, 7, 56, 90]
 * Output: 90
 * Explanation: The largest element of the given array is 90.
 * 
 * Input: arr = [5, 5, 5, 5]
 * Output: 5
 * Explanation: The largest element of the given array is 5.
 * 
 * Input: arr = [10]
 * Output: 10
 * Explanation: There is only one element which is the largest.
 */

 public class GFG_MaximumElementInArray {
    public static void main(String[] args) {
        // int[] arr = {1, 8, 7, 56, 90};
        int[] arr = {1, 8, 7, 102, 56, 90};
        // int[] arr = {5, 5, 5, 5};
        // int[] arr = {10};
        System.out.println("The Maximum No from Array is : " + largest(arr));     
    }

    public static int largest(int[] arr) 
    {
        if(arr.length == 1)
        {
            return arr[0];
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }
        return max;    
    }
}
