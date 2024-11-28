public class GFG_DIsplayLongestName {
    public static void main(String[] args) 
    {
        // String names[]= {"Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks"};
        String names[]= {"Apple", "Mango", "Orange", "Banana"};
        // String names[] = {"RPnRVy", "TmWcy", "y", "c", "peViKeF", "MZ", "Imkkasvw", "r", "nZK", "CxFxTLS"};
        System.out.println("The Max lenght of a String from Arrays is : " + longest(names));
    }
    static public String longest(String[] names) 
    {
        String s = names[0];
        int max =names[0].length();
        for(int i=1;i<names.length;i++)
        {
            if(max < names[i].length())
            {
                s = names[i];
                max = s.length();
            }
        }
        return s;
    }
}
