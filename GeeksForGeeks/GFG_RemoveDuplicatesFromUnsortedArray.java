import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class GFG_RemoveDuplicatesFromUnsortedArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 4, 2};
        System.out.println("The Original Array is : " + Arrays.toString(arr));
        System.out.println("The Elements are : " + removeDuplicated(arr));        
    }

    // After 1010 testcases its failing in the website with Exceeded time limit but later i used SET
    static ArrayList<Integer> removeDuplicated(int arr[])
    // static Set<Integer> removeDuplicated(int arr[])
    {
        // List<Integer> newArray = new ArrayList<>();
        // newArray.add(arr[0]);
        // for (int i = 1; i < arr.length; i++) {
        //     if(newArray.contains(arr[i]))
        //     {
        //         continue;
        //     }
        //     else
        //     {
        //         newArray.add(arr[i]);
        //     }
        // }
        // return newArray;

        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        // return set;

        // Convert set back to ArrayList
        List<Integer> uniqueArray = new ArrayList<>();
        for (int num : set) {
            uniqueArray.add(num);
        }
        return (ArrayList<Integer>)uniqueArray;

        // System.out.println("The New Arrray List elements are : " + newArray);
    }
}
