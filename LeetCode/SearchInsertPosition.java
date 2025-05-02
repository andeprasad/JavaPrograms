package LeetCode;

class SearchInsertPosition
{
    public static void main(String[] args) 
    {
        // int[] nums = {1,3,5,6};
        // int target = 5;
        // int[] nums = {1,3,5,6};
        // int target = 2;
        int[] nums = {1,3,5,6};
        int target = 7;
        System.out.println("The Index is : " + searchInsert(nums, target));
    }

    static public int searchInsert(int[] nums, int target) 
    {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target || nums[i] > target)
            {
                return i;
            }
        }
        return nums.length;
    }
}