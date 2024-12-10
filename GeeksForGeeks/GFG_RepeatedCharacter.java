/*
 * Given a string consisting of lowercase english alphabets. Find the repeated character present first in the string.
 * NOTE - If there are no repeating characters return '#'.
 * Input:
 * S = "geeksforgeeks"
 * Output: g
 * Explanation: g, e, k and s are the repeating characters. Out of these, g occurs first. 
 * 
 * Input: 
 * S = "abcde"
 * Output: -1
 * Explanation: No repeating character present. (You need to return '#')
 */

public class GFG_RepeatedCharacter {
    public static void main(String[] args) {
        // String S = "geeksforgeeks";
        String S = "abcde";
        System.out.println(firstRep(S));        
    }

    static char firstRep(String S)
    {
        for(int i=0;i<S.length();i++)
        {
            System.out.println("I Loop : " + i + ", " + S.charAt(i));
            for(int j=i+1;j<S.length();j++)
            {
                System.out.println("J Loop : " + j + ", " + S.charAt(j));
                if(S.charAt(i) == S.charAt(j))
                {
                    return S.charAt(i);
                }
            }
        }
        return '#';
    }
}
