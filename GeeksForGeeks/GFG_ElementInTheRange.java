package GeeksForGeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/*
 * Given an array arr[] containing positive elements. A and B are two numbers defining a range. The task is to check if the
 * array contains all elements in the given range (inclusive).
 * Note: If the array contains all elements in the given range return true otherwise return false.
 *
 * Input: n = 7, A = 2, B = 5, arr[] =  {1, 4, 5, 2, 7, 8, 3}
 * Output: True
 * Explanation: It has all elements between range 2-5 i.e 2,3,4,5.
 *
 * Input: n = 7, A = 2, B = 6, arr[] = {1, 4, 5, 2, 7, 8, 3}
 * Output: False
 * Explanation: The array does not contain 6 hence it do not contains all elements in the range 2-6, the output is No
 */

public class GFG_ElementInTheRange {
    public static void main(String[] args)
    {
//         int n = 7, A = 2, B = 5, arr[] =  {1, 4, 5, 2, 7, 8, 3};
//         int n = 7, A = 2, B = 6, arr[] = {1, 4, 5, 2, 7, 8, 3};
//        int n = 29, A = 3, B = 4, arr[] = {1, 9, 1, 1, 5, 8, 9, 4, 3, 8, 10, 9, 4, 1, 8, 2, 6, 5, 1, 8, 5, 2, 6, 8, 2, 8, 9, 5, 10};
        int n = 5, A = 5, B = 8, arr[] = {8, 3, 10, 1, 1};
//        System.out.println("The Element were present within the range is : " + bruteforce_check_elements(arr, n, A, B));
        System.out.println("The Element were present within the range is : " + check_elements_using_stack(arr, n, A, B));
    }

//    This is working in GFG(42%) but this can be enhanced
    static boolean check_elements_using_stack(int arr[], int n, int A, int B)
    {
        boolean result = false;
        Stack<Integer> st = new Stack<>();
        for (int i = A; i <= B; i++)
        {
            st.add(i);
        }
        for (int i = 0; i < arr.length; i++) {
            if(st.contains(arr[i]))
            {
                st.removeElement(arr[i]);
            }
        }
        System.out.println("The Stack Data is : " + st);
        if(st.empty())
            return true;
        return result;
    }

//    This is working in GFG(33%) but this can be enhanced
    static boolean bruteforce_check_elements(int arr[], int n, int A, int B)
    {
        boolean result=false;
        ArrayList<Integer> newarr = new ArrayList<>();

        for (int i = A; i <= B; i++)
        {
            System.out.println("\nInside I loop");
            for (int j = 0; j < arr.length; j++) {
                System.out.println("Inside J Loop");
                if(i == arr[j])
                {
                    System.out.println("Inside IF Loop");
                    newarr.add(i);
                    break;
                }
            }

        }

        if(newarr.size() == (B-A+1))
        {
            return true;
        }
        return false;
    }
}
