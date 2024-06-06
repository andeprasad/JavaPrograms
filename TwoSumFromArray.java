/*
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * 
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 * 
 */

public class TwoSumFromArray {
    public static void main(String[] args) {
        // int[] nums = {2,7,11,15};
        // int[] nums = {11,15,2,7};
        // int target = 9;
        // int[] nums = {3,2,4};
        // int target = 6;
        int[] nums = {3,3};
        int target = 6;

        System.out.println("Numbers in array are : ");
        for(int i: nums)
        {
            System.out.print(i + " ");
        }

        int found = 0;
        int targetMatched = 0;
        int[] targetposition = new int[2];

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                if(i != j)
                {
                    targetMatched = nums[i] + nums[j];
                    if(targetMatched == target)
                    {
                        found = 1;
                        targetposition[0] = i;
                        targetposition[1] = j;
                        break;
                    }
                }
            }
            if(found == 1)
            {
                break;
            }
        }

        if(found == 1)
        {
            System.out.println("\n\nThe Target number " + target + " has been found and its position are "
         + targetposition[0] + "  and " + targetposition[1]);
        }
        else
        {
            System.out.println("\n\nThe Target " + target + " not found in the Array");
        }
    }
}
