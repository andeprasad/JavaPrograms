package LeetCode;

public class ThirdMaxNumber 
{
    public static void main(String[] args) 
    {
        // int[] nums = {3, 2, 1};
        // int[] nums = {1, 2};
        // int[] nums = {1, 1, 2};
        // int[] nums = {1, 2, -2147483648};
        // int[] nums = {2, 2, 3, 1};
        // int[] nums = {-2147483648,1,1};
        int[] nums = {-4,-5,-3,-2,-1};
        
        System.out.println("The Third Maximum No is : " + thirdMax(nums));
    }
    
    static int thirdMax(int[] nums) 
    {
        if(nums.length == 1)
            return nums[0];
        if(nums.length == 2)
            if(nums[0] > nums[1])
                return nums[0];
            else
                return nums[1];

        int firstmax = nums[0];
        int secondmax = Integer.MIN_VALUE;
        int thirdmax = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) 
        {
            if(nums[i] > firstmax)
                firstmax = nums[i];
        }
        System.out.println("First Max : " + firstmax);

        for (int i = 0; i < nums.length; i++) 
        {
            if(firstmax > nums[i])
            {
                if(nums[i] > secondmax)
                {
                    secondmax = nums[i];
                }
            }    
        }
        System.out.println("The Second Max is : " + secondmax);

        boolean went = false;
        for (int i = 0; i < nums.length; i++) 
        {
            if(firstmax > nums[i])
            {
                if(nums[i] < secondmax && nums[i] >= thirdmax)
                {
                    System.out.println("It went inside");
                    went = true;
                    thirdmax = nums[i];
                }
            }
        }
        System.out.println("Third Max is : " + thirdmax);

        if(thirdmax == Integer.MIN_VALUE && went == false)
            return firstmax;

        if(thirdmax < firstmax && secondmax == 0)
            return firstmax;
        return thirdmax ;
    }
}
