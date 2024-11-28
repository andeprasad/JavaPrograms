/*
 * Given an unsorted array arr. Find the count of elements less 
 * than or equal to the given element x.
 * 
 * Input: x = 9, arr = [10, 1, 2, 8, 4, 5] 
 * Output: 5
 * Explanation: The 5 elements are 1, 2, 8, 4 and 5.
 */
public class GFG_CounterOfSmallerElements {
    public static void main(String[] args) 
    {
        // int x = 9, arr[] = {10, 1, 2, 8, 4, 5};
        int x = 2, arr[] = {1, 2, 2, 5, 7, 2, 9};
        System.out.println("The Counter of Number " + x + " is this much times in Array : " + countOfElements(x, arr));
    }
    static public int countOfElements(int x, int[] arr) 
    {
        int counter = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] <= x)
            {
                counter++;
            }
        }
        return counter;
    }
}
