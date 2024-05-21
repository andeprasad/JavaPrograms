import java.util.*;
public class Compare2String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String 1 : ");
        String s1 = sc.nextLine();

        System.out.print("Enter String 2 : ");
        String s2 = sc.nextLine();

        System.out.println("\n\nString 1 is " + s1);
        System.out.println("String 2 is " + s2);

        int count=0;
        if(s1.length() == s2.length())
        {
            System.out.println("\nYes Lenght is Equal");

            for(int i=0;i<s1.length();i++)
            {
                if(s1.charAt(i) == s2.charAt(i))
                    count++;
            }

            if(count == s1.length())
            {
                System.out.println("\n\nYes Both the String are Same");
            }
            else
            {
                System.out.println("\n\nBoth the String are Not Same");
            }
        }
        else
        {
            System.out.println("\nStrings are not Equal");
        }

        sc.close();
    }
}
