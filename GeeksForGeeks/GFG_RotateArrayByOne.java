
import java.util.ArrayList;
import java.util.Arrays;

public class GFG_RotateArrayByOne {
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr);
    }

    static public void rotate(int[] arr) 
    {
        System.out.println("The Initial Int Array is : " + Arrays.toString(arr));

        ArrayList<Integer> array = new ArrayList<>();
        for(int i: arr)
        {
            array.add(i);
        }
        System.out.println("The values in Array list are as follows : " + array);

        do 
        { 
            int lastElementIndex = array.size();
            int lastElement = array.get(lastElementIndex-1);
            array.remove(lastElementIndex-1);
            array.add(0, lastElement);   
        } while (false);

        System.out.println("The Final Array is : " + array);

        int idx = 0;
        for(int i: array)
        {
            arr[idx++] = i;
        }

        System.out.println("The Int Array is : " + Arrays.toString(arr));
    }
}
