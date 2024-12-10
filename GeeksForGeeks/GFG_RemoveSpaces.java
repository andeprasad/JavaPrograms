public class GFG_RemoveSpaces {
    public static void main(String[] args) {
        // String S = "geeks  for geeks";
        String S = "   -    g      f      g   -   .";
        System.out.println(modify(S));
    }

    static String modify(String S)
    {
        String newStr = "";
        for (int i = 0; i < S.length(); i++) {
            if(S.charAt(i) != ' ')
            {
                newStr += S.charAt(i);
            }
        }
        return newStr;
    }
}
