import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A Serial Number : ");
        int number = sc.nextInt();
        int size = String.valueOf(number).length();
        System.out.println("\nSize : " + size);

        int reverseNumber = 0;
        // for(int i=0;i<size;i++)
        // {
            for(int j=size;j>0;j--)
            {
                reverseNumber = Integer.parseInt("") + j;
            }

            System.out.println("\nRverse Numbber : " + reverseNumber);
        // }
    }
}
