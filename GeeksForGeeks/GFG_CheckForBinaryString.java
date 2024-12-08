import java.util.Arrays;

public class GFG_CheckForBinaryString {
    public static void main(String[] args) {
        // String s = "101";
        String s = "75";
        System.out.println(isBinary(s));
    }

    static boolean isBinary(String s) {
        char[] c = s.toCharArray();
        System.out.println(Arrays.toString(c) + "\n");
        
        int count = 0;
        for (char d : c) {
            System.out.println(d);

            if(d == '0' || d == '1')
            {
                count++;
                // return false;
                // System.out.println("Yes");
            }
        }
        if(count == s.length())
        {
            return true;
        }

        return false;
    }
}
