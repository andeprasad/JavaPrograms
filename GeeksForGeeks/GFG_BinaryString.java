/*
 * Given a binary string S. The task is to count the number of substrings that start and end with 1. 
 * For example, if the input string is “00100101”, then there are three substrings “1001”, “100101” and “101”.
 * 
 * Input:
 * N = 4S = 1111
 * Output: 6Explanation: There are 6 substrings from the given string. They are 11, 11, 11, 111, 111, 1111.
 * 
 * Input:
 * N = 5
 * S = 01101
 * Output: 3Explanation: There 3 substrings from the given string. They are 11, 101, 1101.
 * 
 */

import java.util.ArrayList;
import java.util.List;

public class GFG_BinaryString {
    public static void main(String[] args) {
        // int n = 4;
        // String S = "1111";
        int n = 5;
        String S = "01101";
        System.out.println(binarySubstring(n, S));
    }

    // This code has executed until 100 testcases in website due to it has exceeded the execution time
    public static int binarySubstring(int a, String str)
    {
        int count = 0;
        List<String> li = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            if(str.charAt(i) == '1')
            {
                for (int j = i+1; j < a; j++) {
                    if(str.charAt(i) == str.charAt(j))
                    {
                        li.add(str.substring(i, j+1));
                        count++;
                    }
                }
            }
        }
        for (String string : li) {
            System.out.println(string);
        }
        return count;
    }
}
