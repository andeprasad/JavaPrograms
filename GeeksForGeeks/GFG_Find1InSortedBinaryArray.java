/*
 * Given a sorted array arr consisting of 0s and 1s. The task is to 
 * find the index (0-based indexing) of the first 1 in the given array.
 * NOTE: If one is not present then, return -1.
 * 
 * Input : arr[] = [0, 0, 0, 0, 0, 0, 1, 1, 1, 1]
 * Output : 6
 * Explanation: The index of first 1 in the array is 6.
 */
public class GFG_Find1InSortedBinaryArray {
    public static void main(String[] args) {
        int arr[] = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1};
        System.out.println("1 is present at Index in Array is : " + firstIndex(arr));
    }
    static public long firstIndex(int arr[]) 
    {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1)
            {
                return i;
            }
        }
        return -1;
    }
}
