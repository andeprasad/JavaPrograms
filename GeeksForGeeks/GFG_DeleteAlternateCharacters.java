/*
Given a string s as input. Delete the characters at odd indices of the string. Return the
final string after deletion of characters at odd indices.
Input: s = "Geeks"
Output: "Ges"
Explanation: Deleted "e" at index 1 and "k" at index 3.
Input: s = "GeeksforGeeks"
Output: "GesoGes"
Explanation: Deleted e, k, f, r, e, k at index 1, 3, 5, 7, 9, 11.
 */
public class GFG_DeleteAlternateCharacters {
    public static void main(String[] args) {
//        String s = "Geeks";
        String s = "GeeksforGeeks";
        System.out.println(delAlternate(s));
    }
    static String delAlternate(String S) {
        String newStr = "";
        for (int i = 0; i < S.length(); i+=2) {
//            System.out.println("Index is : " + i);
            newStr += S.charAt(i);
        }
        return newStr;
    }
}
