import java.util.Arrays;

/*
Given a alphanumeric string S, extract maximum numeric value from S.
Input:
S = 100klh564abc365bg
Output: 564
Explanation: Maximum numeric value among 100, 564 and 365 is 564.
Input:
S = abcdefg
Output: -1
Explanation: Return -1 if no numeric
value is present.
 */
public class GFG_ExtractMaximumNoFromString {
    public static void main(String[] args) {
        String S = "100klh564abc365bg";
//        String S = "abchsd0sdhs";
//        String S = "abcdefg";
        System.out.println(extractMaximum(S));
    }

    static int extractMaximum(String S)
    {
        String[] strSplit = S.split("[a-z]");
        if(strSplit.length == 0)
        {
            return -1;
        }
        System.out.println("String split is : " + Arrays.toString(strSplit));
        int maxi = 0;
        for (String s : strSplit) {
            if (!s.isEmpty()) {
                maxi = Math.max(maxi, Integer.parseInt(s));
            }
        }
        return maxi;
    }
}
