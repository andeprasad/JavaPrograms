/*
 * Input : arr = [1, 2, 3, 4]
 * Output : 21
 * Explanation: Sum up an array from index 0 to 1 = 3, 
 * Sum up an array from index 2 to 3 = 7. 
 * Their multiplication is 21.
 */
public class GFG_MultiplyLeftAndRightArraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("The Multiply of two subarrays is : " + multiply(arr));
    }
    static public int multiply(int[] arr) 
    {        
        int len = arr.length;
        System.out.println("The length is : " + len);
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i < len/2)
            {
                sum1+= arr[i];
            }
            else
            {
                sum2+= arr[i];
            }
        }
        return sum1 * sum2;
    }
}
