public class SearchCeilingNumberUsingBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 8, 10, 12, 15, 20};
        int target = 9;
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        int count = 0;
        while(start <= end)
        {   
            mid = (start + end)/2;

            if(arr[mid] < target)
            {
                start = mid + 1;
            }
            else if(arr[mid] > target)
            {
                end = mid - 1;
            }
            else
            {
                System.out.println("The Target is present at Index : " + start);
                count++;
                break;
            }
        }
        if(count == 0)
            System.out.println("The Ceiling Number is : " + arr[start]);
    }
}
