import java.util.Arrays;
import java.util.HashMap;

/*
 * Given a string S, Check if characters of the given string can be rearranged to form a palindrome.
 * Input:
 * S = "geeksogeeks"
 * Output: Yes
 * Explanation: The string can be converted into a palindrome: geeksoskeeg
 * 
 * Input: 
 * S = "geeksforgeeks"
 * Output: No
 * Explanation: The given string can't be converted into a palindrome.
 */
public class GFG_AnagramPalindromeString {
    public static void main(String[] args) {
//         String S = "geeksogeeks";
//        String S = "naan";
//        String S = "geeksforgeeks";
        String S = "xxppacccc";
//        System.out.println(isPossible(S));
        System.out.println(isPossibleChatGPT(S));
    }

    static int isPossibleChatGPT(String S)
    {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(char ch : S.toCharArray()) {
            hashMap.put(ch, hashMap.getOrDefault(ch,0)+1);
        }

        System.out.println("Hash Map is : " + hashMap);

        int oddCount = 0;

        for(int count: hashMap.values()) {
            System.out.println("Count is : " + count);
            if(count % 2 != 0) {
                oddCount++;
            }
        }

        if(oddCount >1) {
            return 0;
        }

        return 1;
    }

    static int isPossible (String S)
    {
        int len = S.length();
        System.out.println("length of String is : " + len);
        int middle = len / 2;
        System.out.println("Middle Index is : " + middle + ", and the element is : " + S.charAt(middle));
        if(len % 2 == 0)
        {
            String leftString = "";
            for (int i = 0; i < middle; i++) {
                leftString += S.charAt(i);
            }
            System.out.println("The Left String is : " + leftString);
            char[] cleft = leftString.toCharArray();
            System.out.println("The characters of right is : " + Arrays.toString(cleft));
            Arrays.sort(cleft);
            System.out.println("After Sorted the characters of right is : " + Arrays.toString(cleft));
            String rightString = "";
            for (int i = middle; i < len; i++) {
                rightString += S.charAt(i);
            }
            System.out.println("The Right String is : " + rightString);
            char[] cright = rightString.toCharArray();
            System.out.println("The characters of right is : " + Arrays.toString(cright));
            Arrays.sort(cright);
            System.out.println("After Sorted the characters of right is : " + Arrays.toString(cright));
            if(Arrays.equals(cright, cleft))
            {
                return 1;
            }
        }
        else
        {
            String leftString = "";
            for (int i = 0; i < middle; i++) {
                leftString += S.charAt(i);
            }
            System.out.println("The Left String is : " + leftString);
            char[] cleft = leftString.toCharArray();
            System.out.println("The characters of right is : " + Arrays.toString(cleft));
            Arrays.sort(cleft);
            System.out.println("After Sorted the characters of right is : " + Arrays.toString(cleft));
            String rightString = "";
            for (int i = middle + 1; i < len; i++) {
                rightString += S.charAt(i);
            }
            System.out.println("The Right String is : " + rightString);
            char[] cright = rightString.toCharArray();
            System.out.println("The characters of right is : " + Arrays.toString(cright));
            Arrays.sort(cright);
            System.out.println("After Sorted the characters of right is : " + Arrays.toString(cright));
            if(Arrays.equals(cright, cleft))
            {
                return 1;
            }
        }
        return 0;
    }
}
