import java.util.*;

public class Compare2StringUsingStringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter String 1 : ");
        String s1 = sc.nextLine();

        System.out.print("\nEnter String 2 : ");
        String s2 = sc.nextLine();

        System.out.println("\nString 1 is : " + s1);
        System.out.println("String 2 is : " + s2);

        if(s1.equals(s2))
        {
            System.out.println("\nBoth the String are same");
        }
        else
        {
            System.out.println("\nBoth the Strings are not Same");
        }

        sc.close();
    }
}
