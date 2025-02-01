/*
 * Given an array arr of distinct integers. Rearrange the array in such a way that the first element 
 * is the largest and the second element is the smallest, the third element is the second largest and 
 * the fourth element is the second smallest, and so on.
 * Input: arr[] = [7, 1, 2, 3, 4, 5, 6]
 * Output: [7, 1, 6, 2, 5, 3, 4]
 * Explanation: The first element is first maximum and second element is first minimum and so on.
 * 
 * Input: arr[] = [1, 6, 9, 4, 3, 7, 8, 2]
 * Output: [9, 1, 8, 2, 7, 3, 6, 4]
 * Explanation: The first element is first maximum and second element is first minimum and so on.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GFG_AlternativeSorting {
    public static void main(String[] args) {
        // int arr[] = {7, 1, 2, 3, 4, 5, 6};
        int[] arr = {1696, 2478, 3503, 4304, 4887, 5628, 5717, 6014, 6170, 6330, 7543, 8144, 9800, 9839, 9982, 10302, 10463, 11644, 12381, 13096, 14308, 14444, 15649, 16189, 16730, 16946, 17002, 17157, 17729, 18829, 19041, 19954, 20485, 20545, 20596, 20900, 22198, 24204, 24657, 24760, 25025, 25344, 29635, 30333, 31834, 31996, 32321, 32559, 32564};
        System.out.println("The Original Array is : " + Arrays.toString(arr));
        System.out.println("The Alternative sorted is : " + alternateSort(arr));
    }

    public static ArrayList<Integer> alternateSort(int[] arr) 
    {
        Arrays.sort(arr);
        // System.out.println("The Sorted Array is : " + Arrays.toString(arr));
        
        List<Integer> sortedArray = new ArrayList<>();
        for(int i=0;i<arr.length/2;i++)
        {
            sortedArray.add(arr[(arr.length-1)-i]);
            sortedArray.add(arr[i]);
            // System.out.println(i + " " + arr[i] + " " + arr[(arr.length-1)-i]);
        }
        if(arr.length % 2 != 0)
        {
            sortedArray.add(arr[arr.length/2]);   
        }
        return (ArrayList<Integer>) sortedArray;
    }
}
