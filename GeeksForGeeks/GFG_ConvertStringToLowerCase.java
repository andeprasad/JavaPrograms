/*
 * Given a string s. The task is to convert characters of string to lowercase.
 * Input: 
 * s = "ABCddE"
 * Output: "abcdde"
 * Explanation: A, B, C and E are converted to a, b, c and e thus all uppercase 
 * characters of the string converted to lowercase letter.
 * 
 * Input: 
 * s = "LMNOppQQ"
 * Output: "lmnoppqq"
 * Explanation: L, M, N, O, and Q are converted to l, m, n, o and q thus all 
 * uppercase characters of the string converted to lowercase letter.
 */

public class GFG_ConvertStringToLowerCase {
    public static void main(String[] args) {
        String s = "ABCddE";
        System.out.println(toLower(s));
    }

    static String toLower(String s) {
        return s.toLowerCase();
    }
}
