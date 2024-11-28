/*
 * Input: arr[] = [-1, -2, -3, 4, 5, 6, 7], d = 2
 * Output: [-3, 4, 5, 6, 7, -1, -2]
 * Explanation: 
 * Rotate by 1: [-2, -3, 4, 5, 6, 7, -1]
 * Rotate by 2: [-3, 4, 5, 6, 7, -1, -2]
 */
import java.util.Arrays;

public class GFG_RotateAnArray
{
    public static void main(String[] args)
    {
        int arr[] = {-1, -2, -3, 4, 5, 6, 7}, d = 2;
        leftRotate(arr, d);
    }
    static void leftRotate(int arr[], int d)
    {
        System.out.println("This is the Original Array : " + Arrays.toString(arr) + " and the position we need to shift is : " + d);
        int temp;

        for(int j=0;j<d;j++)
        {
            System.out.println("\nThe For loop arr[j] is : " + arr[j]);
            temp = arr[0];
            for(int i=0;i<arr.length;i++)
            {
                if(i == arr.length-1)
                {
                    arr[i] = temp;
                }
                else
                {
                    arr[i] = arr[i+1];
                }
            }
            System.out.println("After rotation the array is : " + Arrays.toString(arr));
        }

        System.out.println("The Final Array after left shifting is " + Arrays.toString(arr));
    }
}
