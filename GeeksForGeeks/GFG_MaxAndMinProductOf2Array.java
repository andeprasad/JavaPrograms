/*
 * Input : arr1 = [5, 7, 9, 3, 6, 2],  arr2 = [1, 2, 6, 1, 9]
 * Output : 9
 * Explanation: The max in arr1 is 9. The min element in arr2 is 1. The product is 9*1 = 9.
 */
public class GFG_MaxAndMinProductOf2Array {
    public static void main(String[] args) {
        int[] arr1 = {5, 7, 9, 3, 6, 2}, arr2 = {1, 2, 6, 1, 9}; 
        System.out.println("The Product of Max and Min of these 2 Arrays is : " + findMultiplication(arr1, arr2));   
    }
    static public long findMultiplication(int[] arr1, int[] arr2) 
    {
        int max = arr1[0];
        int min = arr2[0];
        for (int i = 1; i < arr1.length; i++) 
        {
            if(max < arr1[i])
            {
                max = arr1[i];
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if(min > arr2[i])
            {
                min = arr2[i];
            }
        }
        return max*min;
    }
}
