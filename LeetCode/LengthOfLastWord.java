package LeetCode;

import java.util.Arrays;

public class LengthOfLastWord {
    public static void main(String[] args) {
        // String s = "Hello World ";
        String s = "    fly    me to the moon  ";
        LastWord(s);
    }
    static void LastWord(String s)
    {
        String[] strSplit = s.split(" ");
        System.out.println("The Splitted String is : " + Arrays.toString(strSplit));
        char[] c = strSplit[strSplit.length-1].toCharArray();
        System.out.println("The Length of the Last Word from the Sentence is : " + c.length);
    }
}
