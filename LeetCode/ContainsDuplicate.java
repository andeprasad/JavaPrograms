package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ContainsDuplicate {
    public static void main(String[] args) {
        // int arr[] = {1, 2, 3, 1};
        // int arr[] = {1, 2, 3, 4};
        int arr[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println("The Array contains Duplicate : " + containsDuplicate(arr));
    }
    static public boolean containsDuplicate(int[] arr)
    {
        // List<Integer> listcheck = new ArrayList<>();
        // for (int i = 0; i < arr.length; i++) {
        //     if(listcheck.contains(arr[i]))
        //     {
        //         return true;
        //     }
        //     else
        //     {
        //         listcheck.add(arr[i]);
        //     }
        // }
        // return false;

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) 
        {
            if(hm.containsKey(arr[i]))
            {
                return true;
            }
            else
            {
                hm.put(arr[i], null);
            }
        }
        return false;
    }
}
