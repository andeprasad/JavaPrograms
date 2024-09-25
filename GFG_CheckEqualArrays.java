import java.util.Arrays;

public class GFG_CheckEqualArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 4, 0};
        int[] arr2 = {2, 4, 5, 0, 1};

        System.out.println("Arrays Equal or not : " + check(arr1, arr2));
    }

    public static boolean check(int[] arr1, int[] arr2) {
        // Your code here
        Arrays.sort(arr1);

        Arrays.sort(arr2);

        int count = 0;
        for(int i=0;i<arr1.length;i++)
        {
                if(arr1[i] == arr2[i])
                {
                    count++;
                }
        }

        if(count == arr1.length)
        {
            return true;   
        }
        else
        {
            return false;
        }
    }
}
