public class PalindromeNum {
    public static void main(String[] args) {
        int num = 1221;
        System.out.println("The Number " + num + " is : " + findPalindrome(num));
    }

    static String findPalindrome(int n)
    {
        int temp = n;
        int reverseNumber = 0;
        while(n > 0)
        {
            int rem = n % 10;
            reverseNumber = (reverseNumber * 10) + rem;
            n = n / 10;
        }
        if(temp == reverseNumber)
        {
            return "Palindrome";
        }
        else
            return "Not Palindrome";
    }
}
