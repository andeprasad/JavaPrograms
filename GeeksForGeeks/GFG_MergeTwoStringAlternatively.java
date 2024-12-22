/*
Given two strings S1 and S2 as input, the task is to merge them alternatively i.e.
the first character of S1 then the first character of S2 and so on till the strings end.
NOTE: Add the whole string if other string is empty.
Input:
S1 = "Hello" S2 = "Bye"
Output: HBeylelo
Explanation: The characters of both the given strings are arranged alternatlively.
Input:
S1 = "abc", S2 = "def"
Output: adbecf
Explanation: The characters of both the given strings are arranged alternatlively.
 */
public class GFG_MergeTwoStringAlternatively {
    public static void main(String[] args) {
//        String S1 = "abc", S2 = "def";
//        String S1 = "Hello", S2 = "Bye";
//        String S1 = "Hello", S2 = "";
//        String S1 = "", S2 = "Bye";
//        String S1 = "Qh", S2 = "eyNFX";
//        String S1 = "TjR", S2 = "GxPRYtwyy";
        String S1 = "GxPRYtwyy", S2 = "TjR";
        System.out.println(merge(S1, S2));
    }
    static String merge(String S1, String S2)
    {
        if(S1.isEmpty() && !S2.isEmpty())
        {
            return S2;
        }
        else if(S2.isEmpty() && !S1.isEmpty())
        {
            return S1;
        }
        String newStr = "";
        for (int i = 0; i < S1.length(); i++) {
            System.out.println("Inside I : " + i + " and the character is : " + S1.charAt(i));
            for (int j = i; j <S2.length();) {
                System.out.println("Inside J : " + j + " and the character is : " + S2.charAt(j));
                newStr += S1.charAt(i) + "" + S2.charAt(j);
                if(S1.length()>S2.length() && j == S2.length()-1)
                {
                    System.out.println("Its inside IF");
                    for (int k = S2.length(); k <S1.length() ; k++) {
                        newStr += S1.charAt(k);
                    }
                }
                else if (S2.length()>S1.length() && i == S1.length()-1)
                {
                    System.out.println("Its inside ELSE IF");
                    for (int k = S1.length(); k <S2.length() ; k++) {
                        newStr += S2.charAt(k);
                    }
                }
                break;
            }
        }
        return newStr;
    }
}