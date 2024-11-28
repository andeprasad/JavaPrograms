public class GFG_ArraySearch {
    public static void main(String[] args) 
    {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("The Index of 3 is : " + search(arr, 1));
    }

    static int search(int arr[], int x) 
    {
        int elemetIndex = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == x)
            {
                elemetIndex = i;
                break;
            }
            else
            {
                elemetIndex = -1;
            }
        }
        return elemetIndex;
    }
}
