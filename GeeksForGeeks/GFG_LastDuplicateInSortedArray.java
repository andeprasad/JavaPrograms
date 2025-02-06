/*
 * You are given a sorted array arr[] that may contain duplicate elements. Your task is to find the index 
 * of the last occurrence of any duplicate element and return the index along with the value of that element. 
 * If no duplicate element is found, return [-1, -1].
 * 
 * Input : arr[] = [1, 5, 5, 6, 6, 7]
 * Output : [4, 6]
 * Explanation: Last duplicate element is 6 having index 4.
 * 
 * Input : arr[] = [1, 2, 3, 4, 5]
 * Output: [-1, -1]
 * Explanation: No duplicate elements are present in the array.
 * 
 */

 import java.util.Arrays;

 public class GFG_LastDuplicateInSortedArray 
 {    
     public static void main(String[] args) 
     {
         // int  arr[] = {1, 5, 5, 6, 6, 7};
         int  arr[] = {1, 2, 3, 4, 5};
         System.out.println("The Last Duplicate Element from Sorted Array is : " + Arrays.toString(dupLastIndex(arr)));
     }
 
     public static int[] dupLastIndex(int[] arr) 
     {
         int[] res = {-1, -1};
         for (int i = arr.length-1; i > 0; i--) 
         {
             if(arr[i] == arr[i-1])
             {
                 return new int[]{i, arr[i]};
             }
         }
         return res;
     }
 }
 