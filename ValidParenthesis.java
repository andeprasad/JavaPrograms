/*
 * Input: s = "()"
 * Output: true
 *
 * Input: s = "()[]{}"
 * Output: true
 *
 * Input: s = "(]"
 * Output: false
 */
 
import java.util.*;
 
public class ValidParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter Valid Parenthesis : ");
        String parenthesis = sc.nextLine();
 
        System.out.println("\nEntered Parenthesis are : " + parenthesis);
 
        char[] parenthesisArray = parenthesis.toCharArray();
 
        for(char c : parenthesisArray)
        {
            System.out.println(c);
        }
 
        int valid = 0;
 
        for(int i=0;i<parenthesisArray.length;i++)
        {
            if(parenthesisArray[i] == '[')
            {
                if(parenthesisArray[i+1] == ']')
                    valid = 1;
                else
                    valid = 0;
            }
            else if( parenthesisArray[i] == '{')
            {
                if(parenthesisArray[i+1] == '}')
                    valid = 1;
                else
                    valid = 0;
            }
            else if( parenthesisArray[i] == '(')
            {
                if(parenthesisArray[i+1] == ')')
                    valid = 1;
                else
                    valid = 0;
            }
        }
 
        if (valid==1)
        {
            System.out.println("\nIts Valid Parenthesis");    
        }
        else
        {
            System.out.println("\nIts Invalid Parenthesis");
        }
 
        sc.close();
    }
}