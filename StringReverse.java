import java.util.*;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any String : ");
        String str = sc.nextLine();

        System.out.println("\nString is " + str);

        char[] strreverse = str.toCharArray();

        System.out.println("\nStr reverse is " + strreverse.toString());

        System.out.println("\nLength is " + strreverse.length);

        for(int i=(strreverse.length-1);i>=0;i--)
        {
            System.out.print(strreverse[i]);
        }

        sc.close();
    }
}
