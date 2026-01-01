package LeetCode;

/*
Given an integer array nums sorted in non-decreasing order, return an array of the squares of
each number sorted in non-decreasing order.

Example 1:
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100]. After sorting, it becomes [0,1,9,16,100].

Example 2:
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquareOfSortedArray {
    public static void main(String[] args) {
        int[] arr = {-4, -1 , 0, 1, 3, 9};
//        System.out.println("The Array sorted is : " + Arrays.toString(squareSorted(arr)));
        System.out.println("The Array sorted is : " + Arrays.toString(squareSortedUsing2Pointer(arr)));

    }

    static int[] squareSortedUsing2Pointer(int[] arr)
    {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for (int i = 0; i <arr.length; i++) {
            if(arr[i] < 0)
            {
                int square = arr[i] * arr[i];
                neg.add(square);
            }
            else
            {
                int square = arr[i] * arr[i];
                pos.add(square);
            }
        }
        System.out.println("Positive is : " + pos);
        System.out.println("Negative is : " + neg);
        int i = neg.size();
        int j = 0;
        int counter = 0;
        while(i>0 && j < pos.size())
        {
            if(neg.get(i-1) < pos.get(j))
            {
                arr[counter] = neg.get(i-1);
                i--;
                counter++;
            }
            else
            {
                arr[counter] = pos.get(j);
                j++;
                counter++;
            }
        }

        while(i>0)
        {
            arr[counter] = neg.get(i-1);
            i--;
            counter++;
        }

        while(j < pos.size())
        {
            arr[counter] = pos.get(j);
            j++;
            counter++;
        }

        return arr;
    }

    static int[] squareSorted(int[] arr)
    {
        for (int i = 0; i <arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        System.out.println("Before Sorted : " + Arrays.toString(arr));
        Arrays.sort(arr);
        return arr;
    }
}
