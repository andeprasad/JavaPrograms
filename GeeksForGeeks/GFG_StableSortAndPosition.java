/*
 * Given an array arr integers that may contain duplicate elements, the index of an element of this array 
 * is given to us k (0-based indexing), the task is to find the final position of this element in the array 
 * after the stable sort is applied to the array.
 * 
 * Input: arr[]= [3, 4, 3, 5, 2, 3, 4, 3, 1, 5], k = 5
 * Output: 4
 * Explanation: Element initial index – 5 (3) After sorting array by stable sorting algorithm, 
 * we get array as shown [1(8), 2(4), 3(0), 3(2), 3(5), 3(7), 4(1), 4(6), 5(3), 5(9)] with their 
 * initial indices shown in parentheses next to them.
 * 
 * Input: arr[]= [3, 4, 3, 5, 2, 3, 4, 3, 1, 5], k = 2
 * Output: 3
 * Explanation: Element initial index – 2 (3) After sorting array by stable sorting algorithm, 
 * we get array as shown [1(8), 2(4), 3(0), 3(2), 3(5), 3(7), 4(1), 4(6), 5(3), 5(9)] with their 
 * initial indices shown in parentheses next to them.
 * 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class GFG_StableSortAndPosition
{
    public static void main(String[] args) {
        // int arr[]= {3, 4, 3, 5, 2, 3, 4, 3, 1, 5}, k = 5;
        // int arr[]= {3, 4, 3, 5, 2, 3, 4, 3, 1, 5}, k = 2;
        // int arr[] = {22134, 5760, 20908, 18746, 22155, 17690, 7829, 10395, 30040, 1061, 6243, 31406, 5099, 28742, 27056, 32242, 31706, 23948, 17380, 21893, 24023, 11184, 29281, 8076, 7813}, k = 21;
        // int arr[] = {13054, 23547, 16317, 5241, 424, 30113, 11800, 12992, 6418, 19951, 27083, 20745, 27723, 25412, 12557, 18628, 29399, 931, 15392, 19000, 20659, 25772, 17785, 21528, 16275, 30666, 23841, 18776, 7534, 20141, 2907, 6462, 17468, 9211, 1671, 11708, 3839, 23618, 70, 5117}, k = 4;
        int arr[] = {22289, 8032, 15596, 17426, 1456, 6231, 972, 6494, 19018, 13906, 15043, 17666, 19460, 16495, 5830, 18734, 24862, 23942, 26267, 12193, 18989, 29278, 18494, 31096, 12971, 12320, 19844, 16707, 6834, 26379, 21502, 17246, 3589, 29034, 5152, 16511, 19536, 19139, 11170, 28299, 18097, 10066, 10023, 27566, 5750, 8117, 20253, 26538, 20777, 17641, 15332, 30575, 24010, 12405, 30002, 18157, 12123, 25829, 8374, 7462, 2210, 4730, 1019, 26247, 11562, 5152, 23952, 14712, 9099, 14496, 22886, 2354, 27883, 11287, 9337}, k = 65;
        System.out.println("The Original Array is : " + Arrays.toString(arr));
        System.out.println("After Stable Sorting By using Key Value Pair the Index of " + k + " is : " + getIndexInSortedArrayUsingKeyValuePair(arr, k));
        System.out.println("The Output by Other Guy : " + codeBySomeOtherGuy(arr, k));
    }

    static public int getIndexInSortedArrayUsingKeyValuePair(int[] arr, int k) 
    {
        int element = arr[k];
        System.out.println("The Elemet at Index " + k + " is : " + element);

        List<Pairs> pairs = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            pairs.add(new Pairs(arr[i], i));
        }
        
        System.out.println("All Pairs is : ");
        for (Pairs p : pairs) {
            System.out.println(p.value + " : " + p.index);
        }

        Collections.sort(pairs, new Comparator<Pairs>() 
        {
            @Override
            public int compare(Pairs p1, Pairs p2) {
                // Sort by value first
                if (p1.value != p2.value) {
                    return Integer.compare(p1.value, p2.value);
                }
                // If values are equal, maintain the original order using index
                return Integer.compare(p1.index, p2.index);
            }
        });

        // Print pairs after sorting
        System.out.println("After stable sort:");
        for (Pairs p : pairs) {
            System.out.println(p.value + " : " + p.index);
        }

        int counter = 0;
        for (Pairs p : pairs) {
            counter++;
            if(p.index == k)
            {
                return counter-1; 
            }
        }

        return -1;
    }

    static int codeBySomeOtherGuy(int[] arr, int k)
    {
        int n = arr.length;
        int value = arr[k]; // Element at index k

        // Count occurrences of numbers smaller and equal to 'value'
        int countSmaller = 0;
        int countEqualBeforeK = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] < value) countSmaller++;
            if (arr[i] == value && i < k) countEqualBeforeK++;
        }

        // Final position is determined by elements smaller + earlier occurrences
        return countSmaller + countEqualBeforeK;
    }
}

class Pairs {
    int value;
    int index;

    Pairs(int v, int i)
    {
        value = v;
        index = i;
    }
}