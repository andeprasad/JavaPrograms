package LeetCode;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = -121;
        Palindrome(num);
    }

    static void Palindrome(int num)
    {
        String nums = Integer.toString(num);
        System.out.println("The Converted String is : " + nums);
        char[] charstr = nums.toCharArray();
        String rev = "";
        for (int i = charstr.length-1; i >= 0; i--) {
            rev += charstr[i];           
        }
        System.out.println("The Reverse String is : " + rev);
        if(nums.equals(rev))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
