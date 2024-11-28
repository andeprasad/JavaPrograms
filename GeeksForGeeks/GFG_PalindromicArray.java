/*
 * Given an array arr[] of positive integers. Return true if all 
 * the array elements are palindrome otherwise, return false.
 */
public class GFG_PalindromicArray {
    public static void main(String[] args) 
    {
        int[] arr = {112, 222, 333, 444, 555};
        System.out.println("The Array is Palindromic or Not : " + palinArray(arr));
    }

    public static boolean palinArray(int[] arr) {
        boolean result = true;
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
            if(palinNum(arr[i]))
            {
            }
            else
            {
                result = false;
                break;
            }
        }
        return result;
    }
    static boolean palinNum(int n)
    {
        boolean result;
        int temp = n;
        int rem, sum = 0;
        while(n>0)
        {
            rem = n % 10; // 3
            sum = (sum * 10) + rem; // 3
            n = n / 10; // 12
        }
        result = temp == sum;
        return result;
    }
}
