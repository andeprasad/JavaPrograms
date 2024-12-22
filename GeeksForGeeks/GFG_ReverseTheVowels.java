import java.util.Arrays;

/*
 * Given a string consisting of lowercase english alphabets, reverse only the vowels present in it and print the resulting string.
 * Input:
 * S = "geeksforgeeks"
 * Output: geeksforgeeks
 * Explanation: The vowels are: e, e, o, e, e Reverse of these is also e, e, o, e, e.
 * Input: 
 * S = "practice"
 * Output: prectica
 * Explanation: The vowels are a, i, e Reverse of these is e, i, a.
 */
public class GFG_ReverseTheVowels {
    public static void main(String[] args) {
         String S = "practice";
//         String S = "geeksforgeeks";
//        String S = "meayl";
//        String S = "bcoejuvpvaboyg";
//        String S = "aowuxwhmsncb";
        System.out.println(modify(S));
    }

//    For until 20 testcases its working but after that its giving the time limit exceeded
    static String modify(String s)
    {
        String newStr = "";
        char[] ch = s.toCharArray();
        int icounter = 0;
        if(s.length()/2 == 0)
        {
            
        }
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
            {
                System.out.println("Inside I IF : " + i + " : " + s.charAt(i));
                icounter++;
                int jcounter = 0;
                for (int j = s.length()-1; j >= 0; j--) {
                    if(s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o' || s.charAt(j) == 'u')
                    {
                        System.out.println("Inside J IF : " + j + " : " + s.charAt(j));
                        jcounter++;
                    }
                    System.out.println("I counter is : " + icounter + " and the J Counter is : " + jcounter);
                    if(icounter == jcounter)
                    {
                        ch[j] = s.charAt(i);
                        ch[i] = s.charAt(j);
                        System.out.println("The Char is : " + Arrays.toString(ch) + "\n\n");
                        break;
                    }
                }
            }
        }
        System.out.println("The Char is : " + Arrays.toString(ch));
        for (char c : ch)
            newStr += c;
        return newStr;
    }
}
