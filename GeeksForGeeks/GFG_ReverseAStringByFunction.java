import java.util.Scanner;

public class GFG_ReverseAStringByFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = sc.nextLine();
        sc.close();
        System.out.println("Reversed String is " + reverseWord(name));
    }

    public static String reverseWord(String str)
    {
        // Reverse the string str
        int len = str.length();
        String s = "";

        for(int i=len;i>0;i--)
        {
            s = s + str.charAt(i-1);
        }
        return s;
    }
}
