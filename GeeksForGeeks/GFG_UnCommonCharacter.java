/*
 * Given two strings A and B consisting of lowercase english characters. Find the characters that are not common in the two strings. 
 * Note :- Return the string in sorted order.
 * Input:
 * A = geeksforgeeks
 * B = geeksquiz
 * Output: fioqruz
 * Explanation: 
 * The characters 'f', 'i', 'o', 'q', 'r', 'u','z' 
 * are either present in A or B, but not in both.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GFG_UnCommonCharacter {
    public static void main(String[] args) {
        // String A = "geeksforgeeks";
        // String B = "geeksquiz";
        String A = "characters";
        String B = "alphabets";
        // String A = "geeks";
        // String B = "geeks";
        // System.out.println(UncommonChars(A, B));
        System.out.println(UncommonCharsUsingHashSet(A, B));
    }

    // My Logic
    static String UncommonChars(String A, String B)
    {
        String ans = "";
        for (int i = 0; i <= A.length()-1; i++) {
            // System.out.println("\nInside I Loop : " + A.charAt(i) + "\n");
            for (int j = 0; j <= B.length()-1; j++) {
                // System.out.println("Inside J Loop : " + B.charAt(j));
                if(A.charAt(i) == B.charAt(j))
                {
                    break;
                }
                if(j == B.length()-1)
                {
                    boolean found = false;
                    for (int k = 0; k < ans.length(); k++) {
                        if(ans.charAt(k) == A.charAt(i))
                            found = true;
                    }
                    if(found == false)
                        ans += A.charAt(i);
                }
            }
        }

        // System.out.println("After 1st loop : " + ans);

        for (int i = 0; i <= B.length()-1; i++) {
            // System.out.println("\nInside I Loop : " + B.charAt(i) + "\n");
            for (int j = 0; j <= A.length()-1; j++) {
                // System.out.println("Inside J Loop : " + A.charAt(j));
                if(A.charAt(j) == B.charAt(i))
                {
                    break;
                }
                if(j == A.length()-1)
                {
                    boolean found = false;
                    for (int k = 0; k < ans.length(); k++) {
                        if(ans.charAt(k) == B.charAt(i))
                            found = true;
                    }
                    if(found == false)
                    ans += B.charAt(i);
                }
            }
        }
        char[] c = ans.toCharArray();
        Arrays.sort(c);
        if(ans == "")
            return "-1";
        // else
        //     new String(c);
        return new String(c);
    }

    // Using Set, HashSet Logic by ChatGPT
    static String UncommonCharsUsingHashSet(String A, String B)
    {
        // Use sets to store the characters
        Set<Character> setA = new HashSet<>();
        Set<Character> setB = new HashSet<>();
        
        // Add characters of A to setA
        for (char c : A.toCharArray()) {
            setA.add(c);
        }
        
        // Add characters of B to setB
        for (char c : B.toCharArray()) {
            setB.add(c);
        }
        
        // Create a set for the result
        Set<Character> resultSet = new HashSet<>();
        
        // Add characters from A that are not in B
        for (char c : setA) {
            if (!setB.contains(c)) {
                resultSet.add(c);
            }
        }
        
        // Add characters from B that are not in A
        for (char c : setB) {
            if (!setA.contains(c)) {
                resultSet.add(c);
            }
        }
        
        // If no result found, return "-1"
        if (resultSet.isEmpty()) {
            return "-1";
        }
        
        // Sort the result and convert the set to a string
        List<Character> resultList = new ArrayList<>(resultSet);
        Collections.sort(resultList);
        
        // Convert the list back to a string
        StringBuilder result = new StringBuilder();
        for (char c : resultList) {
            result.append(c);
        }
        System.out.println("Result : " + result);
        
        return result.toString();
    }
}
