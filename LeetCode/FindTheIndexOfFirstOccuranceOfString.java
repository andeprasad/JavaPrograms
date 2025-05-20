/*
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1
 *  if needle is not part of haystack.
 * 
 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * Explanation: "sad" occurs at index 0 and 6. The first occurrence is at index 0, so we return 0.
 * 
 * Input: haystack = "leetcode", needle = "leeto"
 * Output: -1
 * Explanation: "leeto" did not occur in "leetcode", so we return -1.
 */

package LeetCode;

public class FindTheIndexOfFirstOccuranceOfString {
    public static void main(String[] args) {
        // String haystack = "sadbutsad", needle = "sad";
        // String haystack = "aaa", needle = "aaaa";
        // String haystack = "mississippi", needle = "issipi";
        String haystack = "leetcode", needle = "leeto";

        // System.out.println("Index is : " + strStrUsingInBuiltFxn(haystack, needle));
        System.out.println("Index is : " + strStrUsingForLoop(haystack, needle));
    }
    
    static int strStrUsingForLoop(String haystack, String needle) 
    {
        if(needle.length() > haystack.length())
            return -1;
        int start = needle.charAt(0);
        for (int j = 0; j < haystack.length(); j++) {
            if(start == haystack.charAt(j))
            {
                int count = j;
                int found = 0;
                if((haystack.length() - j) >= needle.length())
                {
                    for(int k = 0; k < needle.length(); k++) 
                    {
                        if(haystack.charAt(count) == needle.charAt(k))
                        {
                            found++;
                            count++;
                        }    
                    }
                    if(found == needle.length())
                        return j;
                }
            }
        }
        return -1;
    }

    static int strStrUsingInBuiltFxn(String haystack, String needle) 
    {
        return haystack.indexOf(needle);
    }
}
