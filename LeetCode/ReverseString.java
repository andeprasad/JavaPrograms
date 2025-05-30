package LeetCode;

import java.util.Arrays;

public class ReverseString 
{
    public static void main(String[] args) 
    {
        // char[] s = {'h', 'e', 'l', 'l', 'o'};
        char[] s = {'H', 'a', 'n', 'n', 'a', 'h'};
        reverseString(s);

        System.out.println("Reverse String is : " + Arrays.toString(s));
    }

    static void reverseString(char[] s) 
    {
        System.out.println("The Original Char is : " + Arrays.toString(s));
        int i=0, j=s.length-1;
        while (i<j) 
        {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;    
        }
    }
}
