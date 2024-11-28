
public class GFG_SearchFromArray {
    public static void main(String[] args) 
    {
        int k = 16 , arr[] = {9, 7, 2, 16, 4};
        System.out.println("The Index for " + k + " is " + search(k, arr));
    }
    static public int search(int k, int[] arr) 
    {
        int result = -1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == k)
            {
                result = i;
                break;
            }
        }
        return result;
    }
}
