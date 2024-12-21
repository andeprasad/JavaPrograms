/*
Given a string S, the task is to create a string with the first letter of every word in the string.
Input:
S = "geeks for geeks"
Output: gfg
 */
public class GFG_FirstLetterOfEveryWord {
    public static void main(String[] args) {
        String S = "geeks for geeks";
        System.out.println(firstAlphabet(S));
    }

    static String firstAlphabet(String S) {
        String newStr = "";
        String[] splitStr = S.split(" ");
        for(String s: splitStr)
        {
            newStr += String.valueOf(s.charAt(0));
        }
        return newStr;
    }
}
