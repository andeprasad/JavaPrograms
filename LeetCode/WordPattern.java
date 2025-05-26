/*
 * Given a pattern and a string s, find if s follows the same pattern.
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. Specifically:
 * Each letter in pattern maps to exactly one unique word in s.
 * Each unique word in s maps to exactly one letter in pattern.
 * No two letters map to the same word, and no two words map to the same letter.
 * 
 * Input: pattern = "abba", s = "dog cat cat dog"
 * Output: true
 * Explanation: The bijection can be established as: 'a' maps to "dog". 'b' maps to "cat".
 * 
 * Input: pattern = "abba", s = "dog cat cat fish"
 * Output: false
 * 
 * Input: pattern = "aaaa", s = "dog cat cat dog"
 * Output: false
 */

package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) 
    {
        // String pattern = "abba", s = "dog cat cat dog";
        // String pattern = "abba", s = "dog cat cat fish";
        // String pattern = "aaaa", s = "dog cat cat dog";
        // String pattern = "abba", s = "dog dog dog dog";
        String pattern = "aaa", s = "aa aa aa aa";

        System.out.println("Pattern Matches : " + wordPattern(pattern, s));
    }

    static boolean wordPattern(String pattern, String s) 
    {
        Map<Character, String> m = new HashMap<>();
        String[] strSplit = s.split(" ");
        if(pattern.length()!=strSplit.length)
            return false;
        for (int i = 0; i < pattern.length(); i++) 
        {
            if(m.containsKey(pattern.charAt(i)))
            {
                String strValue = m.get(pattern.charAt(i));
                if(!strValue.equals(strSplit[i]))
                {
                    return false;
                }
            }
            else
            {
                if(!m.containsValue(strSplit[i]))
                    m.put(pattern.charAt(i), strSplit[i]);
                else
                    return false;
            }
        }
        return true;
    }
}
