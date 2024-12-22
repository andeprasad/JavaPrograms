/*
Given a string str, convert the first letter of each word in the string to uppercase.
Input:
str = "i love programming"
Output: "I Love Programming"
Explanation: 'I', 'L', 'P' are the first letters of the three words.
 */
public class GFG_UpperCaseConversion {
    public static void main(String[] args) {
//        String s = "i love programming";
        String s = "cg ax uv dm snjc ws a x nkr wdh ofni x bgxod m m r x kus a yap ajil bvmckzgnonlwuz azuvb";
        System.out.println(transform(s));
    }

    // For the above input its failing in the website but the output is correct, and i have reported it as the bug.
    static public String transform(String s)
    {
        String newStr = "";
        String abc = String.valueOf(s.charAt(0));
        String converted = abc.toUpperCase();
        newStr += converted;

        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == ' ')
            {
                newStr += " ";
                i++;
                String abc1 = String.valueOf(s.charAt(i));
                String converted1 = abc1.toUpperCase();
                newStr += converted1;
            }
            else
            {
                newStr += String.valueOf(s.charAt(i));
            }
        }
        return newStr;
    }
}
