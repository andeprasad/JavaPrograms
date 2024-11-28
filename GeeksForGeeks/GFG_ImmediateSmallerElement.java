/*
 * Input: n = 5, arr[] = {4, 2, 1, 5, 3}
 * Output: 2 1 -1 3 -1
 * Explanation: Array elements are 4, 2, 1, 5, 3. 
 * Next to 4 is 2 which is smaller, so we print 2. Next of 2 is 1 which is smaller,
 * so we print 1. Next of 1 is 5 which is greater, so we print -1. 
 * Next of 5 is 3 which is smaller, so we print 3.  Note that for last element,
 * output is always  going to be -1 because there is no element on right.
 */

public class GFG_ImmediateSmallerElement {
    public static void main(String[] args) 
    {
        // int n = 5, arr[] = {4, 2, 1, 5, 3};
        int n = 6, arr[] = {5, 6, 2, 3, 1, 7};
        immediateSmaller(arr, n);
    }

    static void immediateSmaller(int arr[], int n) 
    {
        for(int i=0;i<n;i++)
        {
            if(i==n-1)
            {
                System.out.print("-1 ");
                arr[i] = -1;
            }
            else
            {
                if(arr[i] > arr[i+1])
                {
                    System.out.print(arr[i+1] + " ");
                    arr[i] = arr[i+1];
                }
                else
                {
                    System.out.print("-1 ");
                    arr[i] = -1;
                }
            }
        }
    }
}
