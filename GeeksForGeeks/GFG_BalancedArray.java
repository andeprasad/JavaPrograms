/*
 * Given an array arr of even size, the task is to find a minimum value that 
 * can be added to an element so that the array becomes balanced. 
 * An array is balanced if the sum of the left half of the array elements 
 * is equal to the sum of the right half.
 * 
 * Input: arr = [1, 5, 3, 2]
 * Output: 1
 * Explanation: Sum of first 2 elements is 1 + 5  = 6, 
 * Sum of last 2 elements is 3 + 2  = 5, To make the array balanced you can add 1.
 */
import java.util.ArrayList;
import java.util.List;

public class GFG_BalancedArray {
    public static void main(String[] args) {
        // int[] arr = {1, 5, 3, 2};
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(5);
        arr.add(3);
        arr.add(2);

        System.out.println("The Balance Number to make array equal is : " + minValueToBalance(arr));
    }
    static public int minValueToBalance(List<Integer> arr) 
    {
        int len = arr.size();
        System.out.println("The Length of the List is : " + len);
        int sum1= 0, sum2=0;
        for (int i = 0; i < len; i++) 
        {
            if(i < len/2)
            {
                sum1+=arr.get(i);
            }
            else
            {
                sum2+=arr.get(i);
            }
        }
        System.out.println("Sum1 is : " + sum1);
        System.out.println("Sum2 is : " + sum2);
        int balanced = sum1-sum2;
        System.out.println("Balanced Value is : " + balanced);
        if(balanced < 0)
        {
            balanced = balanced * -1;
        }
        return balanced;
    }
}
