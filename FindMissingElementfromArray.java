import java.util.*;

class FindMissingElementfromArray
{
    public static void main(String[] args) {
        // int arr[] = {5,6,7,8,10};

        int arr[] = {4, 5, 6, 3, 1};

        int number = findMissingElement(arr);
        System.out.print("The element which is not present frm Array is : " + number);
    }

    
    static int findMissingElement(int arr[])
    {
        Arrays.sort(arr);
        int n = arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == n)
            {
                n++;
            }
            else
            {
                return n;
            }

        }
        return n;
    }
}