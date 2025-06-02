/*
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 * 
 * Input: s = "leetcode
 * Output: 0
 * Explanation: The character 'l' at index 0 is the first character that does not occur at any other index.
 * 
 * Input: s = "loveleetcode"
 * Output: 2
 * 
 * Input: s = "aabb"
 * Output: -1
 * 
 */

package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString 
{
    public static void main(String[] args) 
    {
        // String s = "leetcode";
        // String s = "loveleetcode";
        // String s = "aabb";
        String s = "aadadaad";

        System.out.println("First Unique Character is : " + firstUniqChar(s));
    }

    static int firstUniqChar(String s) 
    {
        Map<Character, Integer> m = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(m.containsKey(s.charAt(i)))
            {
                int value = m.get(s.charAt(i));
                value = value + 1;
                m.put(s.charAt(i), value);
            }
            else
            {
                m.put(s.charAt(i), 1);
            }
        }
        System.out.println("The Map is : " + m);

        for (int i = 0; i < s.length(); i++) 
        {
            if(m.containsKey(s.charAt(i)) && m.get(s.charAt(i)) == 1 )
            {
                return i;
            }
        }

        return -1;
    }
}
