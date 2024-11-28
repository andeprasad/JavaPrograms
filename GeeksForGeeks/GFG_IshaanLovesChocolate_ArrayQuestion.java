/*
 * As we know, Ishaan has a love for chocolates. He has bought a huge 
 * chocolate bar that contains N chocolate squares. Each of the squares 
 * has a tastiness level which is denoted by an array A[].
 * Ishaan can eat the first or the last square of the chocolate at once. 
 * Ishaan has a sister who loves chocolates too and she demands the 
 * last chocolate square. Now, Ishaan being greedy eats the more tasty square first. 
 * Determine the tastiness level of the square which his sister gets.
 * 
 * Input : arr[ ] = {5, 3, 1, 6, 9}
 * Output : 1
 * Explanation:
 * Initially: 5 3 1 6 9
 * In first step: 5 3 1 6
 * In Second step: 5 3 1
 * In Third step: 3 1
 * In Fourth step: 1
 * Return 1
 */
import java.util.ArrayList;
import java.util.List;

public class GFG_IshaanLovesChocolate_ArrayQuestion {
    public static void main(String[] args) 
    {
        int arr[] = {5, 3, 1, 6, 9};
        // int arr[] = {5, 9, 2, 6};
        int n = arr.length;
        System.out.println("The Sister will eat : " + chocolates(n, arr));
    }
    public static int chocolates(int n, int[] arr) 
    {
        int result = 0;
        List<Integer> list = new ArrayList<>();
        for (Integer integer : arr) 
        {
            list.add(integer);    
        }
        System.out.println("The elements into the list are : " + list + " \n\n");
        // for(int i=0;i<arr.length-1;i++)
        // {
        //     list.remove(findMax(list));
        //     System.out.println("After removing the List is : " + list);
        // }
        // result = list.get(0);

        list.sort(null);    //Normal Upar commented wla code be chal rha h but GFG mai time ke issue ke vajah se compiler ko C** bnaya
        System.out.println("The elements in Sorted list are : " + list + " \n\n");
        result = list.get(0);
        return result;
    }

    static int findMax(List<Integer> list)
    {
        int max = list.get(0);
        int index = 0;
        for(int i=1;i<list.size();i++)
        {
            if(max < list.get(i))
            {
                index = i;
                max = list.get(i);
            }
        }
        return index;
    }
}
