import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");        
        int n = sc.nextInt();

        System.out.println("The Given Number is : " + n);
        int num = 1;

        for(int i=n;i>=1;i--)
        {
            num = num * i;
        }
        System.out.println("\n\nThe Factorial is " + num);

        sc.close();
    }
}
