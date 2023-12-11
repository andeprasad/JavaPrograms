import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        System.out.println("\nNumber is " + n);

        int temp = 0;
        int a = 0;
        int b = 1;

        for(int i=0;i<n;i++)
        {
            System.out.println(a);
            temp = a + b;
            a = b;
            b = temp;
            // temp = b;
            
        }
    }
}
