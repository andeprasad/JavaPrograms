package LeetCode;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) 
    {
        // String s = "()";
        // String s = "[";
        // String s = "((";
        // String s = "()[]{}";
        // String s = "(]";
        // String s = "){";
        String s = "(){}}{";
        System.out.println("Valid Parenthesis : " + isValid(s));
    }

    static boolean isValid(String s) 
    {
        if(s.length() == 1)
            return false;
        
        if(s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}')
            return false;

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) 
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
            {
                st.add(s.charAt(i));
            }
            else
            {
                if(st.isEmpty())
                    return false;
                char c = s.charAt(i);
                char lastchat = st.pop();
                if(c == ')' && lastchat == '(')
                {
                    continue;
                }
                else if(c == '}' && lastchat == '{')
                {
                    continue;
                }
                else if(c == ']' && lastchat == '[')
                {
                    continue;
                }
                else
                {
                    return false;
                }
            }
        }
        if(st.empty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
