public class SearchFloorNumberUsingBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 8, 10, 12, 15, 20};

        int start = 0, end = arr.length-1, count = 0, mid = 0;
        int target = 5;
        while(start <= end)
        {
            mid = (start + end) / 2;
            // System.out.println("\nThe Mid element is : " + mid);

            if(target < arr[mid])
            {
                end = mid - 1;
            }
            else if(target > arr[mid])
            {
                start = mid + 1;
            }
            else
            {
                System.out.println("\n\nThe Element is found and its Index is : " + start);
                count++;
                break;
            }
        }
        if(count == 0)
        {
            System.out.println("\n\nThe Floor Number is : " + arr[end]);
        }
    }
}
