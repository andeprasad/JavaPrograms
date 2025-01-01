import java.util.ArrayList;
import java.util.List;

public class GFG_RemoveDuplicatesFromUnsortedArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 4, 2};
        System.out.println("The Elements are : " + removeDuplicated(arr));        
    }

    // After 1010 testcases its failing in the website with Exceeded time limit
    static ArrayList<Integer> removeDuplicated(int arr[])
    {
        List<Integer> newArray = new ArrayList<>();
        newArray.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(newArray.contains(arr[i]))
            {
                continue;
            }
            else
            {
                newArray.add(arr[i]);
            }
        }
        System.out.println("The New Arrray List elements are : " + newArray);
        return (ArrayList)newArray;
    }
}
