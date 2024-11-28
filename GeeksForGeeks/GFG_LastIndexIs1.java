public class GFG_LastIndexIs1 {
    public static void main(String[] args) 
    {
        // String s = "00001";
        String s = "0";
        System.out.println("The Last Index of 1 from our String is : " + lastIndex(s));
    }
    static public int lastIndex(String s) 
    {
        int index=-1;
        char[] c = s.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            if(c[i] == '1')
            {
                index = i;
                break;
            }
        }
        return index;
    }
}
