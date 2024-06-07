class LinearSearchFromArray
{
    public static void main(String[] args) {
        int[] arr = {15, 20, 25, 30};
        int target = 30;

        int found = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == target)
            {
                found  = 1;
                break;
            }
        }

        if(found == 1)
        {
            System.out.println("\nThe Target " + target + " found in Array");
        }
        else
        {
            System.out.println("\nThe Target " + target + " Not found in Array");
        }
    }
}