/*
 * 
 * Binary search will be done for Sorted arrays, and in this example i am using ascending order array
 * Calculate the mid value and then check it with the target value and perform the process accordingly
 * 
 */

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 8, 10, 12, 15, 20};

        // int number = 15;
        int number = 4;
        // int number = 1;

        for (int i : arr) {
            System.out.print(i + " ");   
        }
        System.err.println();
        int start = 0;
        int end = arr.length -1;
        int mid;

        int count = 0;

        while(start <= end)
        {
            mid = (start + end) / 2;
            if(arr[mid] > number)
            {
                end = mid - 1;
            }
            else if(arr[mid] < number)
            {
                start = mid + 1;
            }
            else
            {
                System.out.println("\nNumber Found : " + arr[mid] + " and the index Is " + mid);
                count++;
                break;
            }
        }

        if(count == 0)
        {
            System.out.println("\n\nNumber Not Found");
        }
    }
}
