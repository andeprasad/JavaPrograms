public class PalindromeString {
    public static void main(String[] args) {
        String name = "naman";
        // String name = "prasad";
        System.out.println("The String : " + name + " is : " + findPalindromeString(name));
    }

    static String findPalindromeString(String s)
    {
        String rev = "";
        for (int i = s.length()-1; i >= 0; i--) 
        {
            rev = rev + s.charAt(i);
            // System.out.println(s.charAt(i));
        }
        System.out.println("The Reverse is : " + rev);
        if(rev.equals(s))
        {
            return "Palindrome";
        }
        return "Not Palindrome";
    }
}
