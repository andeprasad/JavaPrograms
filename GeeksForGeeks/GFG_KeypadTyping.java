/*
You are given a n length string S of lowercase alphabet characters and the task is to
find its matching decimal representation as on the shown keypad. Output the decimal
representation corresponding to the string. For ex: if you are given amazon then its
corresponding decimal representation will be 262966.
Input:
S = geeksforgeeks
Output: 4335736743357
Explanation:geeksforgeeks is 4335736743357 in decimal when we type it using the given keypad.
Input:
S = geeksquiz
Output: 433577849
Explanation: geeksquiz is 433577849 in decimal when we type it using the given keypad.
 */
public class GFG_KeypadTyping {
    public static void main(String[] args) {
        String S = "geeksforgeeks";
        System.out.println(printNumber(S, S.length()));
    }
    public static String printNumber(String s, int n)
    {
        String newStr = "";
        for (int i = 0; i < n; i++) {
            switch (s.charAt(i))
            {
                case 'a', 'c', 'b':
                    newStr += '2';
                    break;
                case 'd', 'e', 'f':
                    newStr += '3';
                    break;
                case 'g', 'h', 'i':
                    newStr += '4';
                    break;
                case 'j', 'k', 'l':
                    newStr += '5';
                    break;
                case 'm', 'n', 'o':
                    newStr += '6';
                    break;
                case 'p', 'q', 'r', 's':
                    newStr += '7';
                    break;
                case 't', 'u', 'v':
                    newStr += '8';
                    break;
                case 'w', 'x', 'y', 'z':
                    newStr += '9';
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + s.charAt(i));
            }
        }
        return newStr;
    }
}
