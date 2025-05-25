package LeetCode;

// An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all the original letters exactly once.

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) 
    {
        String s = "anagram", t = "nagaram";
        // String s = "rat", t = "car";
        System.out.println("The Anagram : " + isAnagram(s, t));    
    }

    static boolean isAnagram(String s, String t) 
    {
        if(s.length() != t.length())
            return false;
        Map<Character, Integer> m = new HashMap<>();
        Map<Character, Integer> m1 = new HashMap<>();
        
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
            if(m1.containsKey(t.charAt(i)))
            {
                int value = m1.get(t.charAt(i));
                value = value + 1;
                m1.put(t.charAt(i), value);
            }
            else
            {
                m1.put(t.charAt(i), 1);
            }
        }

        if(m.equals(m1))
        {
            return true;
        }
        return false;
    }
}
