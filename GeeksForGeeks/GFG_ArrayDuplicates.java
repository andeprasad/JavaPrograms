package GeeksForGeeks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
Given an array arr[] of size n, containing elements from the range 1 to n, and each element appears at most twice,
return an array of all the integers that appears twice.
Note: You can return the elements in any order but the driver code will print them in sorted order.
Input: arr[] = [2, 3, 1, 2, 3]
Output: [2, 3]
Explanation: 2 and 3 occur more than once in the given array.
Input: arr[] = [3, 1, 2]
Output: []
Explanation: There is no repeating element in the array, so the output is empty.
 */

public class GFG_ArrayDuplicates {
    public static void main(String[] args)
    {
//        int arr[] = {2, 3, 1, 2, 3};
        int arr[] = {3, 1, 2};
        System.out.println("The Duplicates Array is : " + findDuplicates(arr));
    }
    static public ArrayList<Integer> findDuplicates(int[] arr)
    {
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i]))
            {
                list.add(arr[i]);
            }
            else
            {
                map.put(arr[i], 1);
            }
        }
        return list;
    }
}
