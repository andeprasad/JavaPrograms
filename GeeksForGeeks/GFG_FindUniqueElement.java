/*
 * Given an array of elements occurring in multiples of k, except one element which doesn't 
 * occur in multiple of k. Return the unique element.
 * 
 * Input: k = 3, arr[] = [6, 2, 5, 2, 2, 6, 6]
 * Output: 5
 * Explanation: Every element appears 3 times except 5.
 * 
 * Input: k = 4, arr[] = [2, 2, 2, 10, 2]
 * Output: 10
 * Explanation: Every element appears 4 times except 10.
 */
import java.util.ArrayList;
import java.util.List;

public class GFG_FindUniqueElement {
    public static void main(String[] args) {
        int k = 3, arr[] = {6, 2, 5, 2, 2, 6, 6};
        // int k = 4, arr[] = {2, 2, 2, 10, 2};
        System.out.println("The Unique element is : " + findUnique(k, arr));
    }

    static public int findUnique(int k, int[] arr) 
    {
        List<Integer> processedElement = new ArrayList<>();
        // processedElement.add(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("\nI Loop : " + i + " and the element is : " + arr[i]);
            System.out.println("The Processsed Element is : " + processedElement);
            int counter = 1;
            if(processedElement.contains(arr[i]))
            {
                // break;
                continue;
            }
            else
            {
                for (int j = i+1; j < arr.length; j++) {
                    System.out.println("J Loop : " + j + " and the element is : " + arr[j] + ", and now the Counter is : " + counter);
                    if(arr[i] == arr[j])
                    {
                        System.out.println("Its Inside the IF condition");
                        counter++;
                    }
                }
                processedElement.add(arr[i]);
                System.out.println("After 2nd Loop the counter is : " + counter + " and the k value is " + k);
            }
            System.out.println("\nI Loop : " + i + " and the element is : " + arr[i]);
            if(counter == k && processedElement.contains(arr[i]))
            {
                continue;
            }
            else
            {
                return arr[i];
            }
        }
        return 0;
    }
}
