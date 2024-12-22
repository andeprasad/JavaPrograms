/*
 * Given two strings string1 and string2, remove those characters from first string(string1) 
 * which are present in second string(string2). Both the strings are different and contain only lowercase characters.
 * 
 * Input:
 * string1 = "computer"
 * string2 = "cat"
 * Output: "ompuer"
 * Explanation: After removing characters(c, a, t) from string1 we get "ompuer".
 * Input:
 * string1 = "occurrence"
 * string2 = "car"
 * Output: "ouene"
 * Explanation: After removing characters (c, a, r) from string1 we get "ouene".
 */
public class GFG_RemoveCharacter {
    public static void main(String[] args) {
//        String string1 = "occurrence", string2 = "car";
        String string1 = "computer", string2 = "cat";
        System.out.println("After removing the characters : " + removeChars(string1, string2));
    }

    static String removeChars(String string1, String string2) {
        String newStr = "";
        for (int i = 0; i < string1.length(); i++) {
            int counter = 0;
            for (int j = 0; j <string2.length(); j++) {
                if(string1.charAt(i) == string2.charAt(j))
                {
                    counter++;
                    break;
                }
            }
            if(counter == 0)
            {
                newStr += string1.charAt(i);
            }
        }

        return newStr;
    }
}
