
public class GFG_SortedArraySearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 6}, k = 2;
        System.out.println("The Output of this Array Seach is : " + searchInSorted(arr, k));
    }

    static boolean searchInSorted(int arr[], int k) 
    {
        boolean b = false;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == k)
            {
                b = true;
                break;
            }
        }
        return b;
    }
}
