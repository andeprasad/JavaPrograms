/*
 * Given an array arr[] of positive integers. The task is to return the count 
 * of the number of odd and even elements in the array.
 * Note: Return an array of two elements where the first one in the count of odd & second one is the count of even.
 * 
 * Input: arr[] = [1, 2, 3, 4, 5]
 * Output: 3 2
 * Explanation: There are 3 odd elements (1, 3, 5) and 2 even elements (2 and 4).
 */
import java.util.Arrays;

class GFG_CountEvenOdd
{
    public static void main(String[] args) 
    {
        // int arr[] = {1, 2, 3, 4, 5};
        int arr[] = {1, 1};
        System.out.println("The even and off from this array is : " + Arrays.toString(countOddEven(arr)));
    }
    static public int[] countOddEven(int[] arr) 
    {
        int even = 0, odd = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] % 2 == 0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        return new int[]{odd, even};
    }
}