public class GFG_LargestElementArray {
    public static void main(String[] args) {
        // int[] arr = {1, 8, 7, 56, 90};
        int[] arr = {5, 5, 5, 5};
        // int[] arr = {10};

        System.out.println("The Larges Element from Array is : " + largest(arr));
    }
    public static int largest(int[] arr) {
        int largest = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(largest < arr[i])
            {
                largest = arr[i];
            }
        }
        return largest;
    }
}
