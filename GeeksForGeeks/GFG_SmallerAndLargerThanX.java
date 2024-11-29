/*
 * Given a sorted array arr and a value x, return an array of size 2. 
 * The first value is the number of elements less than or equal to x, 
 * and the second value is the number of elements greater than or equal to x.
 * 
 * Input: arr[] = [1, 2, 8, 10, 11, 12, 19],  x = 0
 * Output: 0, 7
 * Explanation: There are no elements less or equal to 0 and 7 elements greater to 0.
 */
import java.util.Arrays;

public class GFG_SmallerAndLargerThanX {
    public static void main(String[] args) 
    {
        // int arr[] = {1, 2, 8, 10, 11, 12, 19},  x = 0;
        int arr[] = {1, 5, 8, 12, 12, 12, 19},  x = 12;
        System.out.println("The Smaller and Larger number from Array than x is : " + Arrays.toString(getMoreAndLess(arr, x)));
    }
    static int[] getMoreAndLess(int[] arr, int x) 
    {
        int smallcounter = 0,largercounter = 0; 
        for(int i=0;i<arr.length;i++)
        {
            if(x <= arr[i])
            {
                largercounter++;
            }

            if(x >= arr[i])
            {
                smallcounter++;
            }
        }
        int[] result = {smallcounter, largercounter};
        return result;
    }
}
