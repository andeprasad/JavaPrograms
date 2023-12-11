// Input a number and print all the factors of that number (use loops).
import java.util.*;

public class TakeInputNoPrintFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        // int n = Integer.parseInt(sc.next());
        System.out.println("\nNumber is " + n);

        for(int i=2;i<=n;i++)
        {
            if(n%i == 0)
            {
                System.out.println(i);
            }
        }
    }    
}
