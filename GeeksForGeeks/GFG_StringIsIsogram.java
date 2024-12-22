/*
 * Given a string S of lowercase alphabets, check if it is isogram or not. 
 * An Isogram is a string in which no letter occurs more than once.
 * 
 * Input:
 * S = machine
 * Output: 1
 * Explanation: machine is an isogram as no letter has appeared twice. Hence we print 1.
 * 
 * Input:
 * S = geeks
 * Output: 0
 * Explanation: geeks is not an isogram as 'e' appears twice. Hence we print 0.
 */
public class GFG_StringIsIsogram {
    public static void main(String[] args) {
        // String S = "machine";
        String S = "geeks";
        System.out.println(isIsogram(S));
    }
    static int isIsogram(String data){
        for (int i = 0; i < data.length(); i++) {
            for (int j = i+1; j < data.length(); j++) {
                if(data.charAt(i) == data.charAt(j))
                {
                    return 0;
                }
            }
        }
        return 1;
    }
}
