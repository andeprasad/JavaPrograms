import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any Number : ");
        int n = sc.nextInt();

        System.out.println("\nThe Number is " + n);

        int count = 0;

        for(int i=1;i<=n;i++)
        {
            if(n % i == 0)
            {
                count++;
            }
        }

        if(count == 2)
        {
            System.out.println("\nYes its Prime Number");
        }
        else
        {
            System.out.println("\nits Not Prime Number");
        }

        sc.close();
    }
}
