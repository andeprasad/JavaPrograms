/*
Given a string, check if all its characters are the same or not.
Input:
s = "geeks"
Output: False
Explanation: The string contains different character 'g', 'e', 'k' and 's'.
Input:
s = "gggg"
Output: True
Explanation: The string contains only one character 'g'.
 */
public class GFG_CheckString {
    public static void main(String[] args) {
//        String s = "geeks";
        String s = "gggg";
        System.out.println(check(s));
    }
    static Boolean check (String s)
    {
        char first = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (first != s.charAt(i))
            {
                return false;
            }
        }
        return true;
    }
}
