import java.util.*;
public class EvenOddFromUser {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int number = sc.nextInt();

        System.out.println("Number is " + number);

        if((number%2) == 0)
        {
            System.out.println("Number is EVEN");
        }
        else
        {
            System.out.println("Number is ODD");
        }

    }
}
