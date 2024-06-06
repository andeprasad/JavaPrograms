public class MinimumNoFromArray {
    public static void main(String[] args) {
        int[] arr = {5, 7, 6, 10, 100, 2, 1, 9, 102, 0, 15, -1, -2, 20};

        int min = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(min < arr[i])
            {
                min = min;
            }
            else
            {
                min = arr[i];
            }
        }
        System.out.println("\n\nMinimum Number is : " + min);
    }
}
