/*
 * Given two strings s1 and s2. Modify both the strings such that all the common characters of 
 * s1 and s2 are to be removed and the uncommon characters of s1 and s2 are to be concatenated.
 *  Note: If all characters are removed print -1.
 * 
 * Input:
 * s1 = aacdb
 * s2 = gafd
 * Output: cbgf
 * Explanation: The common characters of s1 and s2 are: a, d. The uncommon characters of s1 and s2 
 * are c, b, g and f. Thus the modified string with uncommon characters concatenated is cbgf.
 * 
 * Input:
 * s1 = abcs
 * s2 = cxzca
 * Output: bsxz
 * Explanation: The common characters of s1 and s2 are: a,c. The uncommon characters of s1 
 * and s2 are b,s,x and z. Thus the modified string with uncommon characters concatenated is bsxz.
 * 
 */
public class GFG_RemoveCommonCharFrom2Strings {
    public static void main(String[] args) {
        // String s1 = "aacdb", s2 = "gafd";
        String s1 = "abcs", s2 = "cxzca";
        System.out.println(concatenatedString(s1, s2));
    }

    public static String concatenatedString(String s1,String s2)
    {
        String newStr = "";
        for (int i = 0; i < s1.length(); i++) {
            int count = 0;
            for (int j = 0; j < s2.length(); j++) {
                if(s1.charAt(i) == s2.charAt(j))
                {
                    count++;
                }
            }
            if(count == 0)
            {
                newStr += s1.charAt(i);
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            int count = 0;
            for (int j = 0; j < s1.length(); j++) {
                if(s1.charAt(j) == s2.charAt(i))
                {
                    count++;
                }
            }
            if(count == 0)
            {
                newStr += s2.charAt(i);
            }
        }
        if(newStr.isEmpty())
            return "-1";
        return newStr;
    }
}
