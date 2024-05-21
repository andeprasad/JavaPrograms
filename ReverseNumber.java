import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any Number : ");
        int n = sc.nextInt();

        System.out.println("\nNumber is " + n);

        int temp = n;
        int rev = 0;

        System.out.print("\nReverse Number is ");
        while(temp!=0)
        {
            rev = temp % 10;
            temp = temp / 10;
            System.out.print(rev);
        }

        sc.close();
    }
}
